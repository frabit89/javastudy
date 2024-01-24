package practice02_Cup;

public class Cup {

  private Coffee coffee;
  
  public void fill(Coffee coffee) {
    this.coffee = coffee;
  }
  
  public void whoami() {
    coffee.whoami();
  }
  
  public static void main(String[] args) {
    
    Coffee coffee = new Americano();  // 순서 2 로 넘어가는 동적 바인딩
    
    coffee.whoami();  // 순서 1
    
  }
  
}
