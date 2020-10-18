package edu.ccat.contract;

public class Country implements Comparable<Country> {

  private String name;
  private int population;
  private double area;

  public Country(String name, int population) {
    this.name = name;
    this.population = population;
    this.area = 0.0;
  }

  public Country(String name, int population, double area) {
    this(name, population);
    this.area = area;
  }

  public int getPopulation() {
    return population;
  }

  public double getArea() {
    return area;
  }

  @Override
  public int compareTo(Country country) {
    return this.name.compareTo(country.name);
    // Implementacion detras de escenas
//    if (this.name < country.name) return -1;
//    if (this.name > country.name) return 1;
//    return 0;
  }

  @Override
  public String toString() {
    return String.format("%s - Poblacion: %d - Area: %.2f",
        this.name, this.population, this.area);
  }

  // Comparacion por poblacion
//  @Override
//  public int compareTo(Country country) {
//    if (this.population > country.population) return 1;
//    if (this.population < country.population) return -1;
//    return 0;
//  }
}
