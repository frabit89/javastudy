package pkg01_polymorphysm;

public class Person{
  
  public void powerOn(Elec elec) {
    if(elec instanceof Radio) {
      ((Radio) elec).powerOn();
    }
    else if(elec instanceof Tv) {
      ((Tv) elec).powerOn();
    }
    
    elec.powerOn(); //다운캐스팅 된 후 elec.powerOn에 radio 의powerOn이 호출 가능.
    
  }
}
