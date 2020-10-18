package edu.ccat.behavioral.observer.pattern;

public interface Subject {

  void attachObserver(Observer observer);
  void notifyAllObservers();
}
