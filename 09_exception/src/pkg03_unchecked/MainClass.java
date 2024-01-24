package pkg03_unchecked;

public class MainClass {

  public static void main(String[] args) {

    // unchecked exception : try - catch 문이 없어도 동작하는 예외 클래스로 RuntimeException 을 의미한다.
    
    int mok = 5 / 2;
    System.out.println(mok);
    //0으로 나눴을 때 ArithmeticException(RuntimeException 하위 클래스) 예외 발생
   
    
  }

}
