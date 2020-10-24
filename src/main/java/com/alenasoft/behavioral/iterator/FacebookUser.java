package com.alenasoft.behavioral.iterator;

public class FacebookUser {

  private String fbName;
  private String fbUrl;

  public FacebookUser(String fbName) {
    this.fbName = fbName;
    this.fbUrl = "https://facebook.com/profile/" + fbName;
  }

  @Override
  public String toString() {
    return String.format("FUser: %s, Url: %s", this.fbName, this.fbUrl);
  }
}
