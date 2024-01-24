package pkg04_two_practice;

import javax.imageio.plugins.tiff.TIFFDirectory;

public class MainClass {
  public static void method1() {
    
    
    //구구단 결과
    //arr[0][0] = 2*1, arr[0][1] = 2*2, ..., arr[0][8] = 2*9
    //arr[1][0] = 3*1, 
    //arr[7][0] = 9*1
    int[][] arr = new int[8][9];
    
    for(int i = 0; i < arr.length; i++) { 
      for(int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (i+2)*(j+1);
        System.out.print(String.format("%5d", arr[i][j]));
      }
      System.out.println();
    }
    
  }
  
  public static void method2() {
    
    // apt 출력하기
    // 1층 : 11명
    // 2층 : 10명
    // 3층 : 9명
    int[][] apt = new int[][] {
      {2, 3, 2, 4}, // apt[0][0] [1] [2] [3]
      {1, 1, 5, 3}, // [1]
      {4, 2, 2, 1}  // [2]
    };
    
    for(int i = 0; i < apt.length; i++) {
      int total = 0;
      for(int j = 0; j < apt[i].length; j++) {
        total += apt[i][j];
      }
      System.out.println((i + 1) + "층 : " + total + "명");
      
    }
    
    
  }
  
  public static void method3() {
    
    // 배열 t 시계 방향으로 90도 회전하기
    
    /*
     * 1 1 1 1 1       0 0 0 0 1
     * 0 0 1 0 0       0 0 0 0 1
     * 0 0 1 0 0 --->  1 1 1 1 1 
     * 0 0 1 0 0       0 0 0 0 1
     * 0 0 1 0 0       0 0 0 0 1
     */

    /*
     * 90도 회전하기
     * 1. t 배열의 90도 회전 상태를 rotate 배열에 저장한다.
     * 2. t 배열이 참조하는 값을 rotate 배열로 바꾼다.
     */
    
    int[][] t = {
        {1, 1, 1, 1, 1},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0}
    };
    
    int[][] rotate = new int[5][5];
    
    for(int i = 0; i < t.length; i++) {
      for(int j = 0; j < t[i].length; j++) {        
          rotate[j][4-i] = t[i][j];
      }
    }
    t = rotate;
    
    for(int i = 0; i < t.length; i++) {
      for(int j = 0; j < t[i].length; j++) {
        System.out.print(t[i][j]);
      }
      System.out.println();
    }
  
    
  
  }
  
  
  public static void main(String[] args) {
    method3();
  }

}
