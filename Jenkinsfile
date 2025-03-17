pipeline {
    agent any

    tools {
        maven "Maven3.9"
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scmGit(branches: [[name: '*/integrate-docker']],
                userRemoteConfigs: [[credentialsId: 'fc119a1e-8277-4052-b3ea-73c9128d6797', 
                url: 'https://github.com/ncrekai/Lab2SpringBMaven.git']])
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
    }
}
