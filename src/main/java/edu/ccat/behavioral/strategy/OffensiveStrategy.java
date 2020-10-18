package edu.ccat.behavioral.strategy;

public class OffensiveStrategy implements Strategy {

  @Override
  public void play(Player player) {
    System.out.println(String.format("%s: Play Offensive", player.getName()));
  }
}
