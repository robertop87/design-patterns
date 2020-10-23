package com.alenasoft.duck;

import java.util.ArrayList;
import java.util.List;

public class DuckApp {

  public static void main(String[] args) {

    Sprite duck =
        new Duck(
            () -> {
              System.out.println("Volar como pato");
            },
            () -> {
              System.out.println("Quack!!");
            });

    Sprite rock = new Rock(new RockDisplayBehavior());

    List<Sprite> sprites = new ArrayList<>();
    sprites.add(duck);
    sprites.add(rock);
    sprites.add(
        new Sprite() {
          @Override
          public void play() {
            System.out.println("Mostrar una nube");
          }
        });

    Sprite normalRock = new Rock(new RockDisplayBehavior());

    Rock bombRock = new Rock(new RockDisplayBehavior());
    // pasaron 10 mins
    bombRock.setBombBehavior(new RockBombBehavior());

    sprites.add(normalRock);
    sprites.add(bombRock);

    sprites.forEach(s -> s.play());
  }
}
