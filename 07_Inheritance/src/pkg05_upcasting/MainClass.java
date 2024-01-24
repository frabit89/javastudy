package pkg05_upcasting;

public class MainClass {

  public static void main(String[] args) {
    
    /*
     * 업캐스팅(형 변환)
     * 1. 자식 타입의 객체를 부모 타입으로 바꿀 수 있다.
     * 2. 자동으로 변환된다. (별도의 코드가 필요하지 않음)
     * 3. 부모가 가진 멤버만 호출할 수 있다. 
     */
    
    // 부모 타입 선언
    Computer computer;
    
    // 자식 타입 생성
    computer = new Tablet();
    
    // 부모 타입으로 변환되면 부모의 메소드만 호출할 수 있다.
    // Tablet 의 메소드는 보이지 않음.
    computer.internet();
    computer.game();
    
    
    
  }

}
