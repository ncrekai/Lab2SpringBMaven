pipeline {
    agent any

    tools {
        maven "Maven"
    }

    stages {
        // stage('Start') {
        //     steps {
        //         echo 'NOTE: Tools/Maven running'
        //     }
        // }
        stage('Checkout') {
            steps {
                checkout scmGit(branches: [[name: '*/main']],
                userRemoteConfigs: [[credentialsId: 'fc119a1e-8277-4052-b3ea-73c9128d6797', 
                url: 'https://github.com/ncrekai/Lab2SpringBMaven.git']])
                echo 'NOTE: Git repo defined at checkout stage'
            }
        }
        stage("Compile"){
            steps{
                sh "mvn clean compile"
                echo 'NOTE: Compile stage added, running -> mvn clean compile'
            }
        }
        stage('Build') {
            steps {
               sh " mvn clean package"
                echo 'NOTE: Build will happen here'
            }
        }
        
        
        
        // stage('Build') {
        //     steps {
        //         // Get some code from a GitHub repository
        //         git 'https://github.com/ncrekai/Lab2SpringBMaven.git'

        //         // Run Maven on a Unix agent.
        //         sh "mvn -Dmaven.test.failure.ignore=true clean package"

        //         // To run Maven on a Windows agent, use
        //         // bat "mvn -Dmaven.test.failure.ignore=true clean package"
        //     }

        //     post {
        //         // If Maven was able to run the tests, even if some of the test
        //         // failed, record the test results and archive the jar file.
        //         success {
        //             junit '**/target/surefire-reports/TEST-*.xml'
        //             archiveArtifacts 'target/*.jar'
        //         }
        //     }
        // }
    }
}
