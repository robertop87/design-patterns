package edu.ccat.behavioral.observer.pattern;

public class WebViewObserver implements Observer {

  private String name;
  private double average;

  public WebViewObserver(String name) {
    this.name = name;
  }

  @Override
  public void notifyObserver(double average) {
    this.average = average;
    this.printAverage();
  }

  public void printAverage() {
    System.out.println(this.name
        + " -> The average is: "
        + this.average);
  }
}
