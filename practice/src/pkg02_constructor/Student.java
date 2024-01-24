package pkg02_constructor;

public class Student extends Person{
  
  private String school;
  
  public Student() {
    super(null);
  }

  public Student(String name, String school) {
    super(name);
    this.school = school;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }
  
  
}
