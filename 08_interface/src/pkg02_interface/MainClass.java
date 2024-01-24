package pkg02_interface;

public class MainClass {

  public static void main(String[] args) {

    // Shape.a = 100; 생략했지만 final 이기 때문에 값을 바꿀 수 없다.
    
    // 구현클래스 생성
    Shape shape1 = new Circle(0, 0, 1.5);
    
    // 추상 메소드
    System.out.println(shape1.getArea());
    System.out.println(shape1.getCircum());
    
    // 디폴트 메소드 (구현클래스 타입의 객체로 호출 가능하다.)
    shape1.whoami("원");
    
    // 클래스 메소드
    //shape1.whoami2(null); 는 불가
    Shape.whoami2("원");
    
    // Rectangle
    Shape shape2 = new Rectangle(0, 0, 2, 3);
    
    System.out.println(shape2.getArea());
    System.out.println(shape2.getCircum());
    
    shape2.whoami("사각형");
    Shape.whoami2("사각형");
    
  }

}
