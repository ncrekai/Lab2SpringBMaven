package com.rekai.comp367lab2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

   @GetMapping("/")
   public String index() {
      return "Welcome to COMP367";
   }
}

