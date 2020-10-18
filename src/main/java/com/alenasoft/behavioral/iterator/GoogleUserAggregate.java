package com.alenasoft.behavioral.iterator;

public class GoogleUserAggregate implements Aggregate {

  @Override
  public Iterator createIterator() {
    return new GoogleUserIterator();
  }
}
