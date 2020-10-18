package edu.ccat.behavioral.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class ModelSubject implements Subject {

  private List<Observer> observers;
  private double average;

  public ModelSubject(double average) {
    this.observers = new ArrayList<>();
    this.average = average;
  }

  @Override
  public void attachObserver(Observer observer) {
    this.observers.add(observer);
  }

  @Override
  public void notifyAllObservers() {
    this.observers.forEach(o -> o.notifyObserver(this.average));
//    for (Observer observer : this.observers) {
//      observer.notifyObserver(this.average);
//    }
  }

  public void setAverage(double average) {
    this.average = average;
    this.notifyAllObservers();
  }
}
