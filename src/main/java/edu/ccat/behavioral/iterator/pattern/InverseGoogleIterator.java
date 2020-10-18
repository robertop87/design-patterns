package edu.ccat.behavioral.iterator.pattern;

public class InverseGoogleIterator implements Iterator {

  private Google google;
  private int position;

  public InverseGoogleIterator(Google google) {
    this.google = google;
    this.position = this.google.getGoogleUsers().length - 1;
  }

  @Override
  public boolean isDone() {
    return this.position < 0;
  }

  @Override
  public String currentItem() {
    return this.google.getGoogleUsers()[this.position--].toString();
  }
}
