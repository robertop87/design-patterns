package edu.ccat.behavioral.strategy;

public class Player {

  private String name;
  private int age;
  private Strategy strategy;

  public Player(String name, int age) {
    this.name = name;
    this.age = age;
    this.strategy = new WaitStrategy();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return String.format("Nombre: %s, Edad: %d", this.name, this.age);
  }

  public void play() {
    this.strategy.play(this);
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  // Si ves el siguiente código, probablemente necesitas
  // aplicar strategy
  public void play(int strategyType) {
    switch (strategyType) {
      case 0:
        System.out.println("wait"); break;
      case 1:
        System.out.println("Attack"); break;
      case 2:
        System.out.println("Defend"); break;
    }
  }
}
