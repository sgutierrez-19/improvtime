package com.revature.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.revature.improv.models.Setting;

public class MockSetting {
  private List<Setting> settings;
  private Integer nextId;
  
  public MockSetting() {
    super();
    this.settings = new ArrayList<Setting>();
    this.settings.add(new Setting(1, "at the grocery store"));
    this.settings.add(new Setting(2, "in line at DMV"));
    this.settings.add(new Setting(3, "at the dentists office"));
    this.settings.add(new Setting(4, "at Disneyland"));
    this.settings.add(new Setting(5, "at a wedding"));
    this.nextId = 6;
  }
  
  public List<Setting> getAllSettings() {
    return settings;
  }
  
  public Setting getSettingById(Integer id) {
    Setting out = null;
    for (Setting s : settings) {
      if (s.getSettingId().equals(id)) {
        out = s;
        break;
      }
    }
    if (out == null) {
      throw new RuntimeException("No Settings with the id #" + id + " were found.");
    }
    return out;
  }
  
  public Setting getRandomSetting() {
    Random rand = new Random();
    return settings.get(rand.nextInt(settings.size()));
  }

}
