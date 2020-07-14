package com.revature.improv.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.revature.improv.models.Activity;
import com.revature.improv.models.Characters;
import com.revature.improv.models.Setting;
import com.revature.service.MockActivity;
import com.revature.service.MockCharacter;
import com.revature.service.MockSetting;

@RestController
public class ImprovController {
  
  @GetMapping("/improv") 
  public String getPrompt() {
    Characters charOne =  new MockCharacter().getRandomCharacter();
    Characters charTwo =  new MockCharacter().getRandomCharacter();
    Setting set = new MockSetting().getRandomSetting();
    Activity act = new MockActivity().getRandomActivity();
    return "A " + charOne + " and a " + charTwo + " are " + set.toString() + " " + act.toString();
  }

}
