package main.publishSubscribe;

import java.util.ArrayList;
import java.util.List;

public class Subject {

  //观察者名单
  private List<Observer> observerList = new ArrayList<Observer>();

  //增加减少观察者
  public void attach(Observer ob) {
    this.observerList.add(ob);
  }

  public void detach(Observer ob) {
    this.observerList.remove(ob);
  }

  //提醒观察者
  public void notifyObservers(){
    for(Observer o : observerList){
      o.update();
    }
  }
}
