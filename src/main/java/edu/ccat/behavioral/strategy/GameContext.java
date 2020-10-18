package edu.ccat.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class GameContext {

  public static void main(String[] args) {
    // Director Tecnico
    Player lampe = new Player("Lampe", 33);
    Player tevez = new Player("Tevez", 40);
    Player raldes = new Player("Raldes", 50);

    List<Player> team = new ArrayList<>();
    team.add(lampe);
    team.add(tevez);
    team.add(raldes);

    // Comienza el juego
    System.out.println("======================");
    team.forEach(Player::play);


    tevez.setStrategy(new OffensiveStrategy());
    System.out.println("======================");
    team.forEach(Player::play);

    raldes.setStrategy(new OffensiveStrategy());
    lampe.setStrategy(new OffensiveStrategy());
    System.out.println("======================");
    team.forEach(Player::play);

    tevez.setStrategy(new DefensiveStrategy());
    System.out.println("======================");
    team.forEach(Player::play);
  }
}
