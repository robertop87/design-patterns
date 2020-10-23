package com.alenasoft.behavioral.strategy;

public class DefenseStrategy implements GameStrategy {

  @Override
  public void play() {
    System.out.println("Defender");
  }
}
