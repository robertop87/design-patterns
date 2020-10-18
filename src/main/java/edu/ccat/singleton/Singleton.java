package edu.ccat.singleton;

public class Singleton {

  private static Singleton instance = null;
//  ThreadLocal<Singleton>

  private Singleton() {}

  public synchronized static Singleton getInstance() {
    if (instance == null) {
     instance = new Singleton();
    }
    return instance;
  }
}
