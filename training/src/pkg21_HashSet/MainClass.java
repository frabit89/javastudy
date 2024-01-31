package pkg21_HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass {
  
  public static void method1() {
    Set<String> hobbies;
    hobbies = new HashSet<String>();
    
    hobbies.add("수영");
    hobbies.add("수영");
    hobbies.add("여행");
    hobbies.add("운전");
    hobbies.add("게임");
    
    for(String hobby : hobbies) {
      System.out.println(hobby);
    }
    
  }
  
  public static void method2() {
    
    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));
    
    set1.retainAll(set2);
    System.out.println(set1);
    
  }
  
  public static void method3() {
    
    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5 ,6, 7, 8));
    
    set1.addAll(set2);
    
    System.out.println(set1);
    
  }
  
  public static void method4() {
    
    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));
    
    set1.removeAll(set2);
    
    System.out.println(set1);
    
  }
  
  public static void main(String[] args) {
    method4();
  }

}
