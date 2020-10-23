package com.alenasoft.behavioral.strategy;

public class AttackStrategy implements GameStrategy {

  @Override
  public void play() {
    System.out.println("Atacar");
  }
}
