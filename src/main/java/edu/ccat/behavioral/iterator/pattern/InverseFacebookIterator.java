package edu.ccat.behavioral.iterator.pattern;

public class InverseFacebookIterator implements Iterator {

  private Facebook facebook;
  private int position;

  public InverseFacebookIterator(Facebook facebook) {
    this.facebook = facebook;
    this.position = this.facebook.getFacebook().size() - 1;
  }

  @Override
  public boolean isDone() {
    return this.position < 0;
  }

  @Override
  public String currentItem() {
    return this.facebook.getFacebook().get(this.position--).toString();
  }
}
