package com.alenasoft.behavioral.strategy;

public class WaitGameStrategy implements GameStrategy {

  @Override
  public void play() {
    System.out.println("Esperar");
  }
}
