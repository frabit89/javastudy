package pkg01_polymorphysm;

public class Radio extends Elec {

  @Override
  public void powerOn() {
   System.out.println("전원 스위치를 ON방향으로 옮긴다.");
  }

  
}
