package main.factoryMethod;

public class FactoryMethodMain {

  /**
   * @Auth Hui
   */
  public static void main(String[] args) {
    IFactory factory = new UndergraduateFactory();
    LeiFeng student = factory.createLeiFeng();
    student.buyRice();

    IFactory factory2=new VolunteerFactory();
    LeiFeng volunter = factory2.createLeiFeng();
    volunter.buyRice();

  }

}
