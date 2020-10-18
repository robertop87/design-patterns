package edu.ccat.behavioral.iterator.pattern;

public interface Aggregate {

  Iterator createIterator();
  Iterator createInverseIterator();
}
