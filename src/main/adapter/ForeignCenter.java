package main.adapter;

public class ForeignCenter extends Player {

  public ForeignCenter(String name) {
    this.setName(name);
  }

  public void jinggong() {
    System.out.println(this.getName() + " jinggong");
  }

  public void fangshou() {
    System.out.println(this.getName() + " fangshou");
  }
}
