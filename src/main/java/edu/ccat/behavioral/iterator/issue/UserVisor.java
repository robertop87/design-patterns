package edu.ccat.behavioral.iterator.issue;

public class UserVisor {

  public static void main(String[] args) {
    showUsers(GoogleApi.createIterator());
    showUsers(new FacebookConcreteIterator());

//    for (int i=0; i < FacebookApi.getFacebook().size(); i++) {
//      System.out.println(FacebookApi.getFacebook().get(i));
//    }
  }

//  public static void showUsers(GoogleUser[] users) {
//    for (int i=0; i < users.length; i++) {
//      System.out.println(users[i]);
//    }
//  }

  public static void showUsers(Iterator iterator) {
    while (!iterator.isDone()) {
      System.out.println(iterator.next());
    }
  }
}
