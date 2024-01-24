package pkg07_polymorphism;
// 다형성 : 클래스들의 공통 타입을 가지고 있다.
// 하나의 타입으로 여러개를 저장하려면 부모를 준비




// Tv 와 Radio 의 부모 클래스

public class Person {

  public void powerOn(Elec elec) {    // Elec elec = new Tv() 또는 Elec elec = new Radio()

   /*
    * 1. 다운캐스팅으로 powerOn() 호출하기 -> 전자제품이 추가될때마다 코드의 추가가 필요하므로 추천하지 않는다.
    *  if(elec instanceof Tv) {
    *  ((Tv) elec).powerOn();
    * }
    * else if(elec instanceof Radio) {
    *  ((Radio) elec).powerOn();
    * } 
    */
    
    /*
     * 2. Elec 에 powerOn() 메소드를 추가하고 Tv 나 Radio 가 오버라이드 하기
     */
    
    elec.powerOn();
    
  }
  
  
}
