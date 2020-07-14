package com.revature.improv.models;

public class Activity {

  private Integer activityId;
  
  private String name;
  
  

  public Activity(Integer activityId, String name) {
    super();
    this.activityId = activityId;
    this.name = name;
  }

  public Integer getActivityId() {
    return activityId;
  }

  public void setActivityId(Integer activityId) {
    this.activityId = activityId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  @Override
  public String toString() {
    return this.name;
  }
  
}
