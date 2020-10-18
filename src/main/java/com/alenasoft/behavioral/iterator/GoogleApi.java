package com.alenasoft.behavioral.iterator;

import edu.ccat.behavioral.iterator.issue.Iterator;

public class GoogleApi {

  public static int index = -1;

  public static GoogleUser[] getGoogleUsers() {
    GoogleUser[] googlers = { new GoogleUser("Danae", "d@gmail.com"),
        new GoogleUser("Joaquin", "j@gmail.com"),
        new GoogleUser("Brian", "b@gmail.com")
    };
    return googlers;
  }

  public static Iterator createIterator() {

    return new Iterator() {
      @Override
      public GoogleUser next() {
        if (!isDone()) {
          index++;
          return getGoogleUsers()[index];
        } else {
          return null;
        }
      }

      @Override
      public boolean isDone() {
        return index == getGoogleUsers().length - 1;
      }

      @Override
      public GoogleUser currentItem() {
        return getGoogleUsers()[index];
      }
    };
  }
}
