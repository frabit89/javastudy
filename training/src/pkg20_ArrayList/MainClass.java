package pkg20_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
  
  public static void method1() {
    
    List<Integer> numbers;
    
    numbers = new ArrayList<Integer>();
    
    numbers.add(5);
    numbers.add(4);
    numbers.add(3);
    
    System.out.println(numbers.get(0));
    System.out.println(numbers.get(1));
    System.out.println(numbers.get(2));
  }
  
  public static void method2() {
    
    List<String> hobbies = new ArrayList<String>();
    
    hobbies.add("게임");
    hobbies.add("여행");
    
    System.out.println(hobbies.size());
    
    for(int i = 0, size = hobbies.size(); i < size; i++) {
      System.out.println(hobbies.get(i));
    }
    
  }
  
  public static void method3() {
    Integer[] arr = new Integer[] {10, 20 , 30};
    
    List<Integer> numbers = Arrays.asList(arr);
    
    System.out.println(numbers.toString());
    System.out.println(numbers);
  }
  
  public static void method4() {
    List<String> seasons = new ArrayList<String>();
    
    seasons.add("봄");
    seasons.add("여름");
    seasons.add("파인애플");
    seasons.add("겨울");
    
    seasons.set(2, "가을");
    
    String removeItem = seasons.remove(3);
    System.out.println(removeItem);
    
    System.out.println(seasons);
    
   
  }
  
  
  
  public static void main(String[] args) {
    method4();
  }

}
