package main.state;

public class MornringState extends State {

  @Override
  public void writeProgram(Work w) {
    if(w.getHour()<12){
      System.out.println("the current time:"+w.getHour()+" work hardly!");
    }else{
      w.setState(new NoonState());
      w.writeprogram();
    }
  }

}
