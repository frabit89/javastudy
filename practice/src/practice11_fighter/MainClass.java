package practice11_fighter;

public class MainClass {

  public static void main(String[] args) {
    Fighter fighter1 = new Fighter("최일영", 200);
    Fighter fighter2 = new Fighter("조한나", 150);
    
    boolean myTurn = true;
    int count = 0;   
    
    while(fighter1.isAlive() && fighter2.isAlive()) {
      
      if(myTurn) {
        fighter1.punch(fighter2, (int) (Math.random() * 10) );
      } else {
        fighter2.punch(fighter1, (int) (Math.random() * 10) );
      }
      
      myTurn = !myTurn;
      count++;
      System.out.println(count + "회회회");
    }
    
    if(fighter1.isAlive()) {
      System.out.println(fighter1.getName() + "승리");
    } else {
      System.out.println(fighter2.getName() + "승리");
    }
  }

}
