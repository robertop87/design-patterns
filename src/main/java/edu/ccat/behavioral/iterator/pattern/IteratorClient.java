package edu.ccat.behavioral.iterator.pattern;

import edu.ccat.behavioral.iterator.FacebookUser;
import edu.ccat.behavioral.iterator.GoogleUser;

public class IteratorClient {

  public static void main(String[] args) {
    // Esto debe imprimir las lista de usuarios de donde sea que provengan
    Aggregate facebook = new Facebook();
    printUsers(facebook.createIterator());
    printUsers(facebook.createInverseIterator());

    Aggregate google = new Google();
    printUsers(google.createIterator());
    printUsers(google.createInverseIterator());
  }

  public static void printUsers(Iterator iterator) {
    while (!iterator.isDone()) {
      System.out.println(iterator.currentItem());
    }
  }

  /* Issue
  public static void printUsers(GoogleUser[] users) {
    for (GoogleUser gUser: users) {
      System.out.println(gUser);
    }
  }*/
}
