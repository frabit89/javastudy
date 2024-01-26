package pkg14_Throwable_method;

public class MainClass {

  public static void method1() {
    try {
      Integer.parseInt("12.5");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
  public static void method2() {
    try {
      
      int a = 5;
      int b = 0;
      
      if(b == 0) {
        throw new RuntimeException("0으로 x");
      }
      System.out.println(a/b);
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }
  }
  
  public static void method3() {
    try {
      
      int[] numbers = new int[] {1, 2, 3, 4, 5};
      int total = 0;
      
      for(int i = 0; i <= 5; i++) {
        total += numbers[i];
      }
      System.out.println(total);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  
  public static void main(String[] args) {
    method3();
  }

}
