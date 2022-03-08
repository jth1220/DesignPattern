package main.publishSubscribe;

public class ObserverMain {

  /**
   * @param args
   */
  public static void main(String[] args) {
    ConcreteSubject s = new ConcreteSubject();
    s.setSubjectState("the boss is come back!");
    s.attach(new ConcreteObserver("JiangTH",s));
    s.attach(new ConcreteObserver("HTJiang",s));
    s.notifyObservers();
  }

}
