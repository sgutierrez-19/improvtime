package com.revature.improv.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.revature.improv.models.Setting;
import com.revature.service.MockSetting;

@RestController
public class SettingController {

  @GetMapping("/setting")
  public List<Setting> getAllSet() {
    return new MockSetting().getAllSettings();
  }
  
  @GetMapping("/setting/{id}")
  public Setting getSetById(@PathVariable Integer id) {
    return new MockSetting().getSettingById(id);
  }
}
