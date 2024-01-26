package pkg10_try_catch;

public class MainClass {

  public static void method1() {
    
    String userInput = "12.3";
    
    int number = Integer.parseInt(userInput);
    System.out.println(number);
        
  }
  
  public static void method2() {
   
    try {

      String userInput = "12.3";
      
      int number = Integer.parseInt(userInput);
      System.out.println(number);

    } catch (NumberFormatException e) {
      System.out.println("정수만 입력하세요.");
    }
    
  }
  
  public static void method3() {
    
    String[] userInputs = {"10", "20", "1.5", "2.5", "30"};
    
    for(int i = 0; i < userInputs.length; i++) {
      
      try {
        
        int number = Integer.parseInt(userInputs[i]);
        System.out.println(number);
      } catch (NumberFormatException e) {
        System.out.println("몰라");
      }
    }
    
  }
  
  public static void method4() {
    String[] userInputs = {"10", "20", "15", "25", "30"};
    
    try {
      
      for(int i = 0; i < 6; i++) {
        
        int number = Integer.parseInt(userInputs[i]);
        
        System.out.println(number);
      }
    } catch (NumberFormatException e) {
      System.out.println("정수문제");
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("인덱스문제");
    }
  }
  
  public static void main(String[] args) {
    method4();
  }

}
