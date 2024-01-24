package pkg01_extends;

public class MainClass {

  public static void main(String[] args) {
    
    Ev ev = new Ev();
    
 // Ev 클래스가 사용 가능한 메소드는 4개
    ev.charge();
    ev.forward();
    ev.reverse();
    ev.stop();
    
    
  }

}
