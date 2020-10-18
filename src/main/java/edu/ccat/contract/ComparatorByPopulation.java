package edu.ccat.contract;

import java.util.Comparator;

public class ComparatorByPopulation implements Comparator<Country> {

  @Override
  public int compare(Country country1, Country country2) {
    return Integer.compare(country1.getPopulation(), country2.getPopulation());
    // Implementacion detras de escenas
//    if (country1.getPopulation() > country2.getPopulation()) return 1;
//    if (country1.getPopulation() < country2.getPopulation()) return -1;
//    return 0;
  }
}
