package main.memento;

public class Memento {

  private int vitality;
  private int attrack;
  private int defence;

  public int getVitality() {
    return vitality;
  }

  public int getAttrack() {
    return attrack;
  }

  public int getDefence() {
    return defence;
  }

  public void setVitality(int vitality) {
    this.vitality = vitality;
  }

  public void setAttrack(int attrack) {
    this.attrack = attrack;
  }

  public void setDefence(int defence) {
    this.defence = defence;
  }

  public Memento() {
  }

  public Memento(int vit, int attrack, int defence) {
    this.vitality = vit;
    this.attrack = attrack;
    this.defence = defence;
  }
}
