package edu.ccat.behavioral.iterator.issue;

import edu.ccat.behavioral.iterator.FacebookUser;
import java.util.Arrays;
import java.util.List;

public class FacebookApi {

  public static List<FacebookUser> getFacebook() {
    // Retorna un lista simulada de usuarios de google
    List<FacebookUser> facebookers = Arrays.asList(
        new FacebookUser("LuisRoberto"),
        new FacebookUser("David"),
        new FacebookUser("Oscar")
    );
    return facebookers;
  }
}
