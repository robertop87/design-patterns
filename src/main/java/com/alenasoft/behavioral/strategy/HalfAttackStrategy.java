package com.alenasoft.behavioral.strategy;

public class HalfAttackStrategy implements GameStrategy {

  @Override
  public void play(int numberOfPlayers) {
    System.out.printf("Medio ataque con %d jugadores\n", numberOfPlayers);
  }
}
