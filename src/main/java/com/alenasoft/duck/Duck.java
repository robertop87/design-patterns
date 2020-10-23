package com.alenasoft.duck;

public class Duck implements Sprite {

  private FlyBehavior flyBehavior;
  private SoundBehavior soundBehavior;
  private BombBehavior bombBehavior;

  public Duck(FlyBehavior flyBehavior, SoundBehavior soundBehavior) {
    this.flyBehavior = flyBehavior;
    this.soundBehavior = soundBehavior;
    this.bombBehavior = new DuckBombBehavior();
  }

  @Override
  public void play() {
    this.flyBehavior.fly();
    this.soundBehavior.play();
    // if collission with bullet
    this.bombBehavior.bomb();
  }
}
