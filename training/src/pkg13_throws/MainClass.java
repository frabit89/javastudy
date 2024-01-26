package pkg13_throws;

public class MainClass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int a = 5;
    int b = 0;

    try {
      Calculator calculator = new Calculator();
      calculator.addition(a, b);
      calculator.subtraction(a, b);
      calculator.multiplication(a, b);
      calculator.division(a, b);
    } catch (ArithmeticException e) {
      System.out.println("산술예외");
    }

  }
}
