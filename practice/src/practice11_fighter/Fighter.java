package practice11_fighter;

public class Fighter {
  private String name;
  private double hp;
  
  public Fighter() {
    // TODO Auto-generated constructor stub
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

  public double getHp() {
    return hp;
  }

  public void setHp(double d) {
    this.hp = d;
  }
  
  public boolean isAlive() {
    return hp > 0;
  }
  
  public void punch(Fighter other, double power) {
     
    
    System.out.println(name + "의 펀치");
    if(power >= hp) {
     other.setHp(0);
     } else {
      other.setHp(other.getHp() - power);
      
    }
    
    
    System.out.println(name + "의 hp : " + hp + "," + other.getName() + "의 hp :" + other.getHp() );
    
  }
  
}
