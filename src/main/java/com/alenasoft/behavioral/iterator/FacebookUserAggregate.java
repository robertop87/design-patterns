package com.alenasoft.behavioral.iterator;

public class FacebookUserAggregate implements Aggregate {

  @Override
  public Iterator createIterator() {
    return new FacebookUserIterator();
  }
}
