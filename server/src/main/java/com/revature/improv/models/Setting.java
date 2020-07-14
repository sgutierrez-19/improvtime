package com.revature.improv.models;

public class Setting {


  private Integer settingId;
  
  private String name;
  
  

  public Setting(Integer settingId, String name) {
    super();
    this.settingId = settingId;
    this.name = name;
  }

  public Integer getSettingId() {
    return settingId;
  }

  public void setSettingId(Integer settingId) {
    this.settingId = settingId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  
}
