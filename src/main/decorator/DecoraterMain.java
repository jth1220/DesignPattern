package main.decorator;

public class DecoraterMain {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Person p = new Person("JiangTH");
    System.out.println("The first show:");

    Sneaker s = new Sneaker();
    Hat h = new Hat();
    
    s.decorate(p);
    h.decorate(s);
    h.show();
  }

}
