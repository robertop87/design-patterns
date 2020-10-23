package com.alenasoft.duck;

public class Rock implements Sprite {

  private DisplayBehavior displayBehavior;
  private BombBehavior bombBehavior;

  public Rock(DisplayBehavior displayBehavior) {
    this.displayBehavior = displayBehavior;
  }

  public void setBombBehavior(BombBehavior bombBehavior) {
    this.bombBehavior = bombBehavior;
  }

  @Override
  public void play() {
    this.displayBehavior.display();
    if (this.bombBehavior != null) {
      this.bombBehavior.bomb();
    }
  }
}
