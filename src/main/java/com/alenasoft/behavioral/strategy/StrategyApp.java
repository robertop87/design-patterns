package com.alenasoft.behavioral.strategy;

public class StrategyApp {

  public static void main(String[] args) {

    Team team = new Team();
    team.play();

    // Tenemos el balon
    team.setGameStrategy(new AttackStrategy());
    team.play();

    // Sin balon
    team.setGameStrategy(new DefenseStrategy());
    team.play();

    // Medio Ataque
    team.setGameStrategy(new HalfAttackStrategy());
    team.play();

    team.setGameStrategy(
        new GameStrategy() {
          @Override
          public void play() {
            System.out.println("Simula faltas");
          }
        });
    team.play();
  }
}
