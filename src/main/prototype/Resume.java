package main.prototype;

public class Resume implements Cloneable{
  private String name;
  private String sex;
  private String age;

  public WorkExperience getWorkExperience() {
    return workExperience;
  }

  public void setWorkExperience(String workDate,String workCompany) {
    this.workExperience.setWorkCompany(workCompany);
    this.workExperience.setWorkDate(workDate);
  }

  private WorkExperience workExperience;

  public Resume(String name) {
    this.name = name;
    workExperience=new WorkExperience();
  }
  public Resume(WorkExperience workExperience) throws CloneNotSupportedException {
    this.workExperience= (WorkExperience) workExperience.clone();
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String toString(){
    return name+" "+sex+" "+age+" "+workExperience.getWorkCompany()+" "+workExperience.getWorkDate();
  }
  
  public Resume clone() throws CloneNotSupportedException {
    Resume obj=new Resume(workExperience);
    obj.name=this.name;
    obj.sex=this.sex;
    obj.age=this.age;
    return obj;
  }
}
