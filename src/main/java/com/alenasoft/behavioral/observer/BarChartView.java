package com.alenasoft.behavioral.observer;

public class BarChartView implements Observer {

  private Model model;

  public BarChartView(Model model) {
    this.model = model;
  }

  public void display() {
    // Table with min & max age
    System.out.println("Bar Chart View");
    System.out.println("|| MAX age: " + this.model.getMaxAge());
    System.out.println("|| MIN age: " + this.model.getMinAge());
  }

  @Override
  public void notifyChange() {
    this.display();
  }
}
