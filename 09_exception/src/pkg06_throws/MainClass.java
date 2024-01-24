package pkg06_throws;

public class MainClass {

  public static void main(String[] args) {

    int a = 5;
    int b = 0;
    
    try {
      Calculator calculator = new Calculator();
      calculator.addition(a, b);
      calculator.subtraction(a, b);
      calculator.multiplication(a, b);
      calculator.division(a, b); // calculator 쪽에서 ArithmeticException 예외를 던졌으므로 이쪽에서 예외처리 피요
    } catch (ArithmeticException e) {
      System.out.println("산술 연산 예외가 발생했습니다.");
    }
    
    
  }

}
