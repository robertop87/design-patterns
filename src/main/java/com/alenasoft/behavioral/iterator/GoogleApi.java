package com.alenasoft.behavioral.iterator;

public class GoogleApi {

  public static GoogleUser[] getGoogleUsers() {
    GoogleUser[] googlers = {
      new GoogleUser("Danae", "d@gmail.com"), new GoogleUser("Joaquin", "j@gmail.com")
    };
    return googlers;
  }
}
