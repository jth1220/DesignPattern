package main.memento;

public class MomentoMain {

  /**
   * @param args
   */
  public static void main(String[] args) {
    GameRole role = new GameRole("Hui");
    role.init();
    role.show();
    
    CareTaker ct = new CareTaker();
    ct.setMemento(role.createMemento());

    role.Fight();
    role.show();

    role.recoveryState(ct.getMemento());
    role.show();
  }

}
