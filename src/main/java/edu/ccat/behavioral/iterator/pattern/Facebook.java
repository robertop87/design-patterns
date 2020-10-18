package edu.ccat.behavioral.iterator.pattern;

import edu.ccat.behavioral.iterator.FacebookUser;
import java.util.Arrays;
import java.util.List;

public class Facebook implements Aggregate {

  private List<FacebookUser> facebookUsers;

  public List<FacebookUser> getFacebook() {
    // Retorna un lista simulada de usuarios de facebook
    this.facebookUsers =
      Arrays.asList(
            new FacebookUser("LuisRoberto"),
            new FacebookUser("David"),
            new FacebookUser("Oscar"));

    return this.facebookUsers;
  }

  @Override
  public Iterator createIterator() {
    return new FacebookIterator(this);
  }

  @Override
  public Iterator createInverseIterator() {
    return new InverseFacebookIterator(this);
  }
}
