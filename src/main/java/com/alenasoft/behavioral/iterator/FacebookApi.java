package com.alenasoft.behavioral.iterator;

import java.util.Arrays;
import java.util.List;

public class FacebookApi {

  public static List<FacebookUser> getFacebookUsers() {
    List<FacebookUser> users =
        Arrays.asList(
            new FacebookUser("LuisRoberto"),
            new FacebookUser("David"),
            new FacebookUser("Patricia"));
    return users;
  }
}
