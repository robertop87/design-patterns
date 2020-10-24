package com.alenasoft.behavioral.iterator;

public class GoogleUser {

  private String name;
  private String email;

  public GoogleUser(String name, String email) {
    this.name = name;
    this.email = email;
  }

  @Override
  public String toString() {
    // "GUserName: Luis Roberto Email: luis.roberto.perez@google.com"
    return String.format("GUserName: %s Email: %s", this.name, this.email);
  }
}
