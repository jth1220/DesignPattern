package main.publishSubscribe;

public class ConcreteSubject extends Subject {
  private String subjectState;

  public String getSubjectState() {
    return subjectState;
  }

  public void setSubjectState(String subjectState) {
    this.subjectState = subjectState;
  }

}
