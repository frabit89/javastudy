package pkg15_Custom_Exception;

public class MainClass {
  
  public static void main(String[] args) {
    
    try {
      throw new MyException("예외", 1000);
      
    } catch (MyException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getErrorCode());
    }
    
  }
}
