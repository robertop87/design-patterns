package com.alenasoft.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Model {
  private int maxAge;
  private int minAge;

  private List<Observer> observers;

  public Model(int maxAge, int minAge) {
    this.maxAge = maxAge;
    this.minAge = minAge;
    this.observers = new ArrayList<>();
  }

  public int getMaxAge() {
    return this.maxAge;
  }

  public void setMaxAge(int maxAge) {
    this.maxAge = maxAge;
    this.notifyObservers();
  }

  public int getMinAge() {
    return this.minAge;
  }

  public void setMinAge(int minAge) {
    this.minAge = minAge;
    this.notifyObservers();
  }

  public void attach(Observer observer) {
    this.observers.add(observer);
  }

  private void notifyObservers() {
    this.observers.forEach(o -> o.notifyChange(this));
  }
}
