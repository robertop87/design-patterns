package com.alenasoft.behavioral.iterator;

public class IteratorApp {

  public static void main(String[] args) {
    Aggregate googleUserAggregate = new GoogleUserAggregate();
    printItemsFrom(googleUserAggregate.createIterator());

    Aggregate facebookUserAggregate = new FacebookUserAggregate();
    printItemsFrom(facebookUserAggregate.createIterator());
  }

  public static void printItemsFrom(Iterator iterator) {
    while (!iterator.isDone()) {
      System.out.println(iterator.currentItem());
    }
  }
}
