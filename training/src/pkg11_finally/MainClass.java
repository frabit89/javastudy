package pkg11_finally;

public class MainClass {

  public static void main(String[] args) {
    
    String userInput = "12.4";
    
    try {
      
      int number = Integer.parseInt(userInput);
      System.out.println(number);
    } catch (NumberFormatException e) {
      System.out.println("정수만가능");
    } finally {
      System.out.println("종료");
    }
    
    
  }
  
}
