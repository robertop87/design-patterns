package edu.ccat.behavioral.observer.issue;

public class IssueClient {

  public static void main(String[] args) {
    Model model = new Model(15.5);
    IssueWebView view = new IssueWebView(model);
    //view.startSync();

    view.printAverage(); // click open view
    view.printAverage(); // click open view
    view.printAverage(); // click open view

    model.setAverage(85.5);
    view.printAverage(); // Click or F5


  }
}
