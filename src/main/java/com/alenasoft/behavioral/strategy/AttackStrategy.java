package com.alenasoft.behavioral.strategy;

public class AttackStrategy implements GameStrategy {

  @Override
  public void play(int numberOfPlayers) {
    System.out.printf("Atacar con %d jugadores\n", numberOfPlayers);
  }
}
