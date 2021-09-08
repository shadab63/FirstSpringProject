package com.example.demo.FirstSpringProject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
           public class UserController {

              @GetMapping("/createUser")
              public String createUser() {
               return "Hello";
    }
}
