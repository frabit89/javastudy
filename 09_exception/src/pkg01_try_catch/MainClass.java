package pkg01_try_catch;

public class MainClass {


  public static void method1() {
    
    // 예외 처리가 발생하는 상황
    
    String userInput = "12.3";
    
    int number = Integer.parseInt(userInput);
    System.out.println(number);
  }
  
  public static void method2() {
    
    // 예외 처리 : try - catch
    // try 안에 코드를 넣어놓으면 예외가 발생시에 catch가 오류를 잡음
    try {
      
      String userInput = "12.3";
      
      int number = Integer.parseInt(userInput);
      System.out.println(number);
      
    } catch(NumberFormatException e) {
      
      System.out.println("정수만 입력하세요.");
      
    }
    
  }

  public static void method3() {
    
    String[] userInputs = {"10", "20", "1.5", "2.5", "30"};
    
    for (int i = 0; i < userInputs.length; i++) {
      
      try {
        
        int number = Integer.parseInt(userInputs[i]);
        System.out.println(number);
        
      } catch(NumberFormatException e) {
        
        System.out.println(userInputs[i] + "정수가 아닙니다.");
        
      }
    }
  }
  
  public static void method4() {
    
    // 다중 catch 블록
    
    String[] userInputs = {"10", "20", "15", "25", "30"};
    
    try {
      //for(int i = 0; i < userInputs.length; i++) {
      for(int i = 0; i < 6; i++) {
        //userInputs[5] 가 없으므로 이곳에서 예외 발생
        int number = Integer.parseInt(userInputs[i]);

        System.out.println(number);
      }
    } catch(NumberFormatException e) {
      
      //catch(RuntimeException e) { // 이와 같이 바꾸는 경우 catch(ArrayIndexOutOfBoundsException e) 가 오류. Runtime의 자식이기 때문에 받지 못함.
      
      //catch(ArrayIndexOutOfBoundsException e)를 위에(자식을 위에, 부모를 가장 아래에 배치 하면 해결)
    
      
      System.out.println("정수만 처리할 수 있습니다.");
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("사용할 수 없는 인덱스가 사용되었습니다.");
      }
    
  }
  
  public static void main(String[] args) {
    method4();
  }

}
