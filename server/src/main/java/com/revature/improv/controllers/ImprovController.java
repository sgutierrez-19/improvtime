package com.revature.improv.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.revature.improv.models.Activity;
import com.revature.service.MockActivity;

@RestController
public class ImprovController {
  
  @Autowired
  
  
  @GetMapping("/activities")
  public List<Activity> getAllActs() {
    return new MockActivity().getAllActivities();
  }
  
  @GetMapping("/activities/{id}")
  public Activity getAct(@PathVariable Integer id) {
    return new MockActivity().getActivityById(id);
  }

}
