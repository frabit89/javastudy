package pkg03_constructor;

public class Person {
  
  private String name;
  
  // constructor 
  //디폴트로 생성된 아래 부분을 지우면 자식쪽 constructor 디폴트 생성자 두군데 오류가 생김.
 // public Person() {
  //}

  public Person(String name) {
    super();
    this.name = name;
  }
  
  // method
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  
  
}
