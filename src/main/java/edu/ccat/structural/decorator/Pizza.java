package edu.ccat.structural.decorator;

public class Pizza implements Food {

  private final double fixedPrice = 45.5;

  private String name;

  public Pizza(String name) {
    this.name = name;
  }

  @Override
  public String describe() {
    return String.format("%s (%.2f Bs)", this.name, this.fixedPrice);
  }

  @Override
  public double calculatePrice() {
    return fixedPrice;
  }
}
