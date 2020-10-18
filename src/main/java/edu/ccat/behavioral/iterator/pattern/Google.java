package edu.ccat.behavioral.iterator.pattern;

import edu.ccat.behavioral.iterator.GoogleUser;

public class Google implements Aggregate {

  private GoogleUser[] googleUsers;

  public GoogleUser[] getGoogleUsers() {
    // Retorna un lista simulada de usuarios de google
    GoogleUser[] users = { new GoogleUser("Danae", "d@gmail.com"),
        new GoogleUser("Joaquin", "j@gmail.com"),
        new GoogleUser("Brian", "b@gmail.com")
    };

    this.googleUsers = users;

    return this.googleUsers;
  }

  @Override
  public Iterator createIterator() {
    return new GoogleIterator(this);
  }

  @Override
  public Iterator createInverseIterator() {
    return new InverseGoogleIterator(this);
  }
}
