package edu.ccat.behavioral.observer.pattern;

public class ObserverClient {

  public static void main(String[] args) {
    Subject ageModel = new ModelSubject(15.5);
    Subject resultsModel = new ModelSubject(53.3);

    Observer reactView = new WebViewObserver("REACT");
    Observer angularView = new WebViewObserver("ANGULAR");

    ageModel.attachObserver(reactView);
    ageModel.attachObserver(angularView);

//    view.printAverage(); // click F5
//    view.printAverage(); // click F5
//    view.printAverage(); // click F5

//    model.setAverage(95);
//    model.setAverage(100);
//    model.setAverage(125);
  }
}
