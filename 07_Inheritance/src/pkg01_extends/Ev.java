package pkg01_extends;

// 상속 방법: class 자식 extends 부모 { } 로 쓴다.
// class 서브 extends 슈퍼 { }  

//차이점 
//sub is a super.
//Ev  is a Car
//sub has a super.
//Ev  has a Car. (X)


public class Ev extends Car {

  public void charge() {
    System.out.println("충전");
    //System.out.println(model); //부모의 private 에는 접근 불가
    System.out.println(maker);  // 부모의 protected 에는 접근 가능
    
  }
  
  
}
