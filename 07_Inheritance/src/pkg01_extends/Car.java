package pkg01_extends;

public class Car {
  
  protected String maker; //protected 는 자식에서 오픈한다.
  private String model; //자식(상속자) Ev 쪽에서 접근 불가 
  
  
  
  
  public void forward() {
    System.out.println("앞으로");
  }
  
  public void reverse() {
    System.out.println("뒤로");
  }
  
  
  public void stop() {
    System.out.println("멈춤");
  }
  
  
  
  
  
}
