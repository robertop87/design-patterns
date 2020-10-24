package com.alenasoft.behavioral.observer;

public class BarChartView implements Observer {

  public void display(Model model) {
    // Table with min & max age
    System.out.println("Bar Chart View");
    System.out.println("|| MAX age: " + model.getMaxAge());
    System.out.println("|| MIN age: " + model.getMinAge());
  }

  @Override
  public void notifyChange(Model model) {
    this.display(model);
  }
}
