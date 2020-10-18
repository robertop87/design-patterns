package edu.ccat.behavioral.strategy;

public class DefensiveStrategy implements Strategy {

  @Override
  public void play(Player player) {
    System.out.println(String.format("%s: Play Defensive", player.getName()));
  }
}
