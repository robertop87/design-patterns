package com.alenasoft.behavioral.observer;

public class ObserverApp {

  public static void main(String[] args) {
    Model model = new Model(50, 10);

    Observer tableView = new TableView(model);
    Observer barChartView = new BarChartView(model);

    model.attach(tableView);
    model.attach(barChartView);

    model.setMaxAge(100);
    model.setMinAge(10);
  }
}
