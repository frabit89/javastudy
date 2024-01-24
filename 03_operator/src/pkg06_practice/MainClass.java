package pkg06_practice;

public class MainClass {
  
  public static void method1() {
    
    
    int second = 90;
    int m = second / 60; //1 분
    int s = second % 60; //30  초
    System.out.println(m);
    System.out.println(s);
    
    
  }
  
  public static void method2() {
    
    // x 와 y의 값을 교환하기
    int x = 10;
    int y = 20;
    int temp;
    temp = x; // temp = 10
    x = y;    // x = 20
    y = temp; // y = 10
    

    System.out.println(x); //20
    System.out.println(y); //10
    
  }
  
  public static void method3() {
    // 점수가 90점대이면 true 아니면 false
    int score = 90;
//    boolean i = score >= 90 && score < 100;
//    System.out.println(i);
    // 10으로 나눈 몫이 9인 수
    boolean result2 = (score / 10) == 9;
    System.out.println(result2);
    
  }
  public static void method4() {
    // 짝수/홀수 판단
    // 짝수 : 2로 나눈 나머지가 0인 수
    // 홀수 : 2로 나눈 나머지가 1인 수
    int n = 4;
    
    String p = n % 2 == 0 ? "짝수" : "홀수";
    System.out.println(p);
    
    
  }
  

  public static void main(String[] args) {
    method1();
    method2();
    method3();
    method4();
    
  }

}
