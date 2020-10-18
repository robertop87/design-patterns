package edu.ccat.behavioral.iterator.issue;

public interface Iterator<T> {

  T next();
  boolean  isDone();
  T currentItem();
}
