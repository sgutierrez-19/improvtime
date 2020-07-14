package com.revature.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.revature.improv.models.Activity;

@Service
public class MockActivity {
  private List<Activity> activities;
  private Integer nextId;
  
  public MockActivity() {
    super();
    this.activities = new ArrayList<Activity>();
    this.activities.add(new Activity(1, "baking a cake"));
    this.activities.add(new Activity(2, "preparing for a marathon"));
    this.activities.add(new Activity(3, "writing a screenplay"));
    this.activities.add(new Activity(4, "fighting off wizards"));
    this.activities.add(new Activity(5, "feeding their 20 dogs"));
    this.nextId = 6;
  }
  
  public List<Activity> getAllActivities() {
    return activities;
  }
  
  public Activity getActivityById(Integer id) {
    Activity out = null;
    for (Activity a : this.activities) {
      if (a.getActivityId().equals(id)) {
        out = a;
        break;
      }
    }
    if (out == null) {
      throw new RuntimeException("No Activities with the id #" + id + " were found.");
    }
    return out;
  }
  
}
