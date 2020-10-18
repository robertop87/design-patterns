package com.alenasoft.behavioral.iterator;

public class GoogleUserIterator implements Iterator {

  private int position;
  private GoogleUser[] googleUsers;

  public GoogleUserIterator() {
    this.position = 0;
    this.googleUsers = GoogleApi.getGoogleUsers();
  }

  @Override
  public boolean isDone() {
    return this.position >= this.googleUsers.length;
  }

  @Override
  public String currentItem() {
    return this.googleUsers[this.position++].toString();
  }
}
