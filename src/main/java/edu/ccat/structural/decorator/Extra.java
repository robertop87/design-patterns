package edu.ccat.structural.decorator;

public class Extra implements Food {

  private String name;
  private double price;
  private Food component;

  public Extra(String name, double price, Food component) {
    this.name = name;
    this.price = price;
    this.component = component;
  }

  @Override
  public String describe() {
    return String.format("%s + %s (%.2f Bs), TOTAL: %.2f Bs",
        this.component.describe(),
        this.name,
        this.price,
        this.calculatePrice());
  }

  @Override
  public double calculatePrice() {
    return this.component.calculatePrice() + this.price;
  }
}
