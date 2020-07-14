package com.revature.service;

import java.util.ArrayList;
import java.util.List;
import com.revature.improv.models.Characters;

public class MockCharacter {
  private List<Characters> characters;
  private Integer nextId;
  
  public MockCharacter() {
    super();
    this.characters = new ArrayList<Characters>();
    this.characters.add(new Characters(1, "Princess"));
    this.characters.add(new Characters(2, "Train Conductor"));
    this.characters.add(new Characters(3, "Opera Singer"));
    this.characters.add(new Characters(4, "Mime"));
    this.characters.add(new Characters(5, "Police Officer"));
    this.characters.add(new Characters(6, "King"));
    this.characters.add(new Characters(7, "Astronaut"));
    this.characters.add(new Characters(8, "Interpretive Dancer"));
    this.characters.add(new Characters(9, "Disgruntled Barista"));
    this.characters.add(new Characters(10, "Aspiring Actor"));
    this.characters.add(new Characters(11, "Valley Girl"));
    this.characters.add(new Characters(12, "Old Lady"));
    this.characters.add(new Characters(13, "Marathon Runner"));
    this.characters.add(new Characters(14, "Gamer"));
    this.characters.add(new Characters(15, "Neurotic Psychologist"));
    this.nextId = 7;
  }
  
  public List<Characters> getAllCharacters() {
    return characters;
  }
  
  public Characters getCharacterById(Integer id) {
    Characters out = null;
    for (Characters c : this.characters) {
      if (c.getCharactersId().equals(id)) {
        out = c;
        break;
      }
    }
    if (out == null) {
      throw new RuntimeException("No Characters with the id #" + id + " were found.");
    }
    return out;
  }

}
