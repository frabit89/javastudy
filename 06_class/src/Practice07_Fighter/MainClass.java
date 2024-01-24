package Practice07_Fighter;

public class MainClass {

  public static void main(String[] args) {
    
    Fighter fighter1 = new Fighter("A", 100);
    
    Fighter fighter2 = new Fighter("B", 100);
    
    boolean myTurn =true;
    
    while(fighter1.isAlive() && fighter2.isAlive()) {
      
      if(myTurn) {
        fighter1.punch(fighter2, 20);
      }
      else {
        fighter2.punch(fighter1, 10);
      }
    
    myTurn = !myTurn;
    }
    if(fighter1.isAlive()) {
      System.out.println(fighter1.getName() + "승리를 축하합니다.");
      
    }
    else {
      System.out.println(fighter2.getName() + "승리를 축하합니다.");
    }
    
    
    
  }
 

}
