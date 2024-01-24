package pkg04_loop_practice;

public class MainClass {
  
  
  public static void method1() {
    
    // 100 ~ 1 까지 출력
    int i = 100;
    while (i >= 1) {
      System.out.println(i);
      i--;
    }
    
    
  }
  
  public static void method2() {
    
    // 5 ~ 20 사이 모든 정수의 평균 
//    int n = 5;
//    int total = 0;
//    int count = 0;
//    double avg = 0;
//    while(n <= 20) {
//      total += n;
//      count += 1;
//      n++;
//      avg = (double)total / count;
//    }
//      System.out.println(avg);
      int begin = 1;
      int end = 4;
      int n = begin;
      int total = 0;
      while(n <= end) {
        total += n;
        n++;
      }
        double average = total / (end - begin + 1.0);
        System.out.println(average);
  }

  public static void method3() {
    
    //3단 출력하기
    int dan = 3;
    int i = 1;
    for(i = 1; i<= 9; i++) {
      System.out.println(dan + "x" + i + "=" + dan*i);
    }
      
    
  }
  
  public static void method4() {
    // 70원씩 모금하기
    // 목표는 100000원 이상
    
    // 1회 모금액 70원
    // 2회 모금액 140원
    // 3회 모금액 210원
    int total = 0;
    int money = 70;
    int nth = 0;
    final int GOAL = 100_000;
    while(total <= GOAL) {
      total += money;
      nth ++;
      System.out.println(nth + "회 모금액" + total + "원");
    }
    
  }
  
  
  public static void method5() {
    
    // 2x1=2
    // 2x2=4
    // ...
    // 5X5=25
    for(int n = 2; n <= 9; n++) {
      for(int i = 1; i <= 9; i++) {
        System.out.println(n + "x" + i + "=" + n*i);
        if(i > 5) break;
      }
      if( n > 5) break;
    }
  }
  
  public static void method6() {
    //2x1=2   3x1=3 ... 9x1=9
    //for 문 한번 끝남
    //2x2=4   3x2=6 ... 9x2=18
    //...
    for(int n = 1; n <= 9; n++) {
      
      for(int i = 2; i <= 9; i++) {
          System.out.print(i + "X" + n + "=" + i*n + "\t");
      }
      System.out.println(); 
    }
    
    
  }
  
  public static void method7() {
    /*삼각별 출력하기 -1 (2중 loop)
     * star=12345
     * row=1 *
     * row=2 **
     * row=3 ***
     * row=4 ****
     * row=5 *****
     * 
     * row=1, star=1~1
     * row=2, star=1~2
     * row=3, star=1~3
     * row=4, star=1~4
     * row=5, star=1~5
    */
    
    
    for(int row = 1; row <= 5; row++) {
      for(int star = 1; star <= row; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
   }
  
  public static void method8() {
    
    /*
     * 삼각별 출력하기-2
     *        star=12345
     * row=1       *****
     * row=2       ****
     * row=3       ***
     * row=4       **
     * row=5       *
     * 
     * row=1, star=1~5
     * row=2, star=1~4
     * row=3, star=1~3
     * row=4, star=1~2
     * row=5, star=1~1
     */
    for (int row = 1; row <= 5; row++ ) {
      for(int star = 1; star <= 6 - row; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  public static void method9() {
    
    /*
     * 삼각별 출력하기-3
     * space/star=123456789
     * row=1          *
     * row=2         ***
     * row=3        *****
     * row=4       *******
     * row=5      *********
     * 
     * row=1, space=1~4, star=5~5
     * row=2, space=1~3, star=4~6
     * row=3, space=1~2, star=3~7
     * row=4, space=1~1, star=2~8
     * row=5, space=1~0, star=1~9
     */
    
    for(int row = 1; row <= 5; row++) {
      for(int space = 1; space <= 5-row; space++) {
        System.out.print(" ");

        for(int star = 6 - row; star <= row + 4; star++) {
        System.out.print("*");
        }
        System.out.println("\n");
      }
    }
    

  }
  
  
  public static void method10() {
    
    /*
     * 삼각별 출력하기-4
     * space/star=123456789
     * row=1      *********
     * row=2       *******
     * row=3        *****
     * row=4         ***
     * row=5          *
     * 
     * row=1, space=1~0, star=1~9
     * row=2, space=1~1, star=2~8
     * row=3, space=1~2, star=3~7
     * row=4, space=1~3, star=4~6
     * row=5, space=1~4, star=5~5
     */
    //row = 1, 2, 3, 4, 5
    //space = 0, 1, 2, 3, 4 => row-1
    //star = 9, 8, 7, 6, 5      10 - row     
    //
    
    for(int row = 1; row <= 5; row++) {
      for(int space = 1 ; space <= row - 1 ; space++ ) {
        System.out.print(" ");
      }
        for(int star = row ; star <= 10 - row  ; star++ ) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
    
    
  }  
  
  
  
  public static void main(String[] args) {
    method10();
    
    
    
    
  }

}
