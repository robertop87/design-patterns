package edu.ccat.behavioral.strategy;

public class WaitStrategy implements Strategy {

  @Override
  public void play(Player player) {
    System.out.println(String.format("%s: waiting", player));
  }
}
