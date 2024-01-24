package pkg05_marker_interface;

public class DurianHatePerson {

//  public void eat(Food food) {
//    if(food instanceof Durian) {
//      return;   //실행을 막는 법
//    }
//    food.eat();
//  }
  public void eat(Eatable eatable) {
    ((Food)eatable).eat();
  }
  
  
}
