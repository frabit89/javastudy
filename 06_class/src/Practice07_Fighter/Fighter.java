package Practice07_Fighter;

import Practice06_Cart.Product;

public class Fighter {
  
  private String name;
  private int hp;
  
  // punch() 메소드 만들기

  
  // constructors
  public Fighter() {
    
  }

  public Fighter(String name, int hp) {
    super();
    this.name = name;
    this.hp = hp;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {  //현재 객체의 체력을 반환
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }
  
  public boolean isAlive() {
    return hp > 0;
    
  }
  
  public void punch(Fighter other, int power) {
    if(power >= other.getHp()) {
      other.setHp(0); //주어진 값으로 설정
    }
    else {
      other.setHp(other.getHp() - power);
    }
    System.out.println(name + "의 hp:" + " , " + other.getName() + "의 hp:" + other.getHp());
    
  }
}
