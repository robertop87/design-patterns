package edu.ccat.behavioral.iterator;

public class FacebookUser {

  private String fbName;
  private String fbUrl;

  public FacebookUser(String fbName) {
    this.fbName = fbName;
    this.fbUrl = "http://facebook.com/profile/" + fbName;
  }

  @Override
  public String toString() {
    return String.format("FUser: %s, Url: %s", this.fbName, this.fbUrl);
  }
}
