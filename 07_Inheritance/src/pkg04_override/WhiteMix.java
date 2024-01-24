package pkg04_override;

// 메소드 오버라이드
// 1. 자식 클래스가 부모 클래스의 메소드를 다시 만드는 것
// 2. 메소드 앞에 @Override annotation 을 추가한다. 추가하지 않아도 동작엔 문제가 없다. 하지만 권장
// 3. 똑같이(반환타입, 메소드명, 매개변수) 만들어야 한다.
// 부모의 메소드가 맞지 않은 경우(가져가 쓸 때 틀린 경우)

public class WhiteMix extends Kanu {

  @Override
  public void color() {
    // TODO Auto-generated method stub
    super.color();
  }

//  @Override // 오버라이드한 메소드라고 JVM에게 알려준다. (부가적으로 다른 개발자에게도 알려준다.) 
//public void color() {
//    System.out.println("커피색");
//} 

}
