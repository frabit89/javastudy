package pkg13_throws;

public class Calculator {

  public void addition(int a, int b) {
    System.out.println(a + "+" + b + "=" + (a + b));
  }
  
  public void subtraction(int a, int b) {
    System.out.println(a + "-" + b + "=" + (a - b));
  }
  
  public void multiplication(int a, int b) {
    System.out.println(a + "X" + b + "=" + (a * b));
  }
  
  public void division(int a, int b) throws ArithmeticException{
    System.out.println(a + "/" + b + "=" + (a / b));
  }
  
}
