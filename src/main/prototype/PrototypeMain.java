package main.prototype;

public class PrototypeMain {

  public static void main(String[] args) throws CloneNotSupportedException {
    Resume resume1 = new Resume("JiangTH");
    resume1.setAge("23");
    resume1.setSex("F");
    resume1.setWorkExperience("2020","DBDX");

    Resume resume2 = resume1.clone();
    resume2.setAge("22");

    Resume resume3 = resume1.clone();
    resume3.setWorkExperience("2023","dreamCompany");
    System.out.println(resume1);
    System.out.println(resume2);
    System.out.println(resume3);
  }
}
