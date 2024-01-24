package pkg06_downcasting;

public class MainClass {

  public static void main(String[] args) {
    
    /*
     * 다운캐스팅
     * 1. (업캐스팅 된) 부모 타입의 객체를 자식 타입으로 바꿀 수 있다.
     * 2. 강제로 변환해야 한다.
     * 3. 잘못된 캐스팅을 방지하기 위해서 instanceof 연산자를 사용할 수 있다.
     */
    
    // 업캐스팅 된 부모 타입의 자식 객체
    Computer computer = new SmartWatch();
    Computer computer2 = new Tablet();
    
    
    // Tablet 타입으로 변환
    if(computer2 instanceof Tablet) {
      //instanceof 에 대한 연산자를 쓰면 computer. 을 적었을 때 캐스팅코드가 나옴.
      ((Tablet) computer2).screenTouch();
      ((Tablet) computer2).portable();
    }
    
    computer.game();
    computer.internet();
    
    if(computer instanceof SmartWatch) {
      ((SmartWatch) computer).wearable();
    }
    
    // 잘못된 다운캐스팅 (Wearable 타입으로 변환) - ClassCastException 예외 발생
    ((SmartWatch) computer).wearable();  
    
    
  }

}
