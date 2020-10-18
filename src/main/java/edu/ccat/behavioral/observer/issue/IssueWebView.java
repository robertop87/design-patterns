package edu.ccat.behavioral.observer.issue;

import java.util.Timer;

public class IssueWebView {

  private Model model;
  private double currentAverage;

  public IssueWebView(Model model) {
    this.model = model;
    this.currentAverage = this.model.getAverage();
  }

  public void printAverage() {
    System.out.println("The current average is: " + this.model.getAverage());
  }

  private void syncData() {
    if (this.currentAverage != this.model.getAverage()) {
      this.printAverage();
    }
  }

  private void schedule() {
    // imagine
  }
}
