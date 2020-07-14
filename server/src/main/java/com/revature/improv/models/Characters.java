package com.revature.improv.models;

public class Characters {

  private Integer charactersId;
  
  private String name;

  public Characters(Integer charactersId, String name) {
    super();
    this.charactersId = charactersId;
    this.name = name;
  }

  public Integer getCharactersId() {
    return charactersId;
  }

  public void setCharactersId(Integer charactersId) {
    this.charactersId = charactersId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  
  
  
}
