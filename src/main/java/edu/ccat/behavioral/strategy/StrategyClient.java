package edu.ccat.behavioral.strategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StrategyClient {

  public static void main(String[] args) {
    // Mostrar la lista de jugadores
    List<Player> players = Arrays.asList(
        new Player("Roberto", 18),
        new Player("Juan", 45),
        new Player("Eddy", 15)
    );
    players.forEach(System.out::println);

    // Mostrar la lista ordenada por edad
//    Collections.sort(players, new Comparator<Player>() {
//      @Override
//      public int compare(Player player1, Player player2) {
//        return Integer.compare(player1.getAge(), player2.getAge());
//      }
//    });
    Collections.sort(players,
        (player1, player2) -> Integer.compare(player1.getAge(), player2.getAge()));
    players.forEach(System.out::println);

    Collections.sort(players,
        (player1, player2) -> player1.getName().compareTo(player2.getName()));
    players.forEach(System.out::println);
  }
}
