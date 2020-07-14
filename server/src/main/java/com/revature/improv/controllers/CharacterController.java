package com.revature.improv.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.revature.improv.models.Characters;
import com.revature.service.MockCharacter;

@RestController
public class CharacterController {

  @GetMapping("/hello")
  public String testEndpoint() {
    return "Hello";
  }
  
  @GetMapping("/characters")
  public List<Characters> getAllChar() {
    return new MockCharacter().getAllCharacters();
  }
  
  @GetMapping("/characters/{id}")
  public Characters getCharById(@PathVariable Integer id) {
    return new MockCharacter().getCharacterById(id);
  }
}
