package main.singleton;

public class Person {
  
  private String name;
  private Person child;
  
  private Person(String name){
    this.name = name;
  }
  
  public Person createInstance(String name){
    if(child == null){
      child = new Person(name);
    }
    return child;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
