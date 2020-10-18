package edu.ccat.contract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCountries {

  public static void main(String[] args) {
    List<Country> countries = Arrays.asList(
        new Country("Bolivia", 5550, 123.5),
        new Country("Venezuela", 8630, 853.56),
        new Country("Brasil", 856811, 1583.5),
        new Country("Uruguay", 3000, 484.98)
    );

    System.out.println("Sin Ordenamiento");
    countries.forEach(System.out::println);

    System.out.println("Ordenado natural: por nombre");
    Collections.sort(countries);
    countries.forEach(System.out::println);

    System.out.println("Ordenado por poblacion");
    Collections.sort(countries, new ComparatorByPopulation() );
    countries.forEach(System.out::println);

    System.out.println("Ordenado por poblacion");
    Collections.sort(countries, new Comparator<Country>() {
      @Override
      public int compare(Country country1, Country country2) {
        return Integer.compare(country1.getPopulation(), country2.getPopulation());
      }
    });
    countries.forEach(System.out::println);

    System.out.println("Ordenado por poblacion con funciones de orden alto");
    Collections.sort(countries, (c1, c2) ->
        Integer.compare(c1.getPopulation(), c2.getPopulation()));
    countries.forEach(System.out::println);

    System.out.println("Ordenado por area con funciones de orden alto");
    Collections.sort(countries, (c1, c2) ->
        -1*Double.compare(c1.getArea(), c2.getArea()));
    countries.forEach(System.out::println);
  }

  // Ordenamiento con tipos primitivos en este caso String
//  public static void main(String[] args) {
//    List<String> countries = new ArrayList<>();
//    countries.add("Bolivia");
//    countries.add("Venezuela");
//    countries.add("Brasil");
//
//    System.out.println("No ordenado");
////    for (String countryName : countries) {
////      System.out.println(countryName);
////    }
//    countries.forEach(System.out::println);
//
//    System.out.println("Ordenado");
//    Collections.sort(countries);
//    countries.forEach(System.out::println);
//  }
}
