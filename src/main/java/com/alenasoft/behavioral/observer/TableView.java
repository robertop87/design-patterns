package com.alenasoft.behavioral.observer;

public class TableView implements Observer {

  private Model model;

  public TableView(Model model) {
    this.model = model;
  }

  public void display() {
    // Table with min & max age
    System.out.println("Table View");
    System.out.println("MAX age: " + this.model.getMaxAge());
    System.out.println("MIN age: " + this.model.getMinAge());
  }

  @Override
  public void notifyChange() {
    this.display();
  }
}
