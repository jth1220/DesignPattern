package main.decorator;

public class Hat extends Finery {

  @Override
  public void show(){
    System.out.print(" hat ");
    super.show();
  }
}
