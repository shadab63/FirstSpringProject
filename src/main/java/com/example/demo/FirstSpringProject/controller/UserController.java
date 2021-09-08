package com.example.demo.FirstSpringProject.controller;


import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/user")
           public class UserController {

  //  Logger log = (Logger) LoggerFactory.getLogger(UserController.class);
              @GetMapping("/createUser")
              public String createUser() {

      //            log.info("insidede");

               return "Hello";
    }
}
