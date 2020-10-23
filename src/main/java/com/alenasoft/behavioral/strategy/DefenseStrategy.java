package com.alenasoft.behavioral.strategy;

public class DefenseStrategy implements GameStrategy {

  @Override
  public void play(int numberOfPlayers) {
    System.out.printf("Defender con %d jugadores\n", numberOfPlayers);
  }
}
