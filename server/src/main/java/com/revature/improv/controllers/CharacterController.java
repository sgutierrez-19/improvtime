package com.revature.improv.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {

  @GetMapping("/hello")
  public String testEndpoint() {
    return "Hello";
  }
  
}
