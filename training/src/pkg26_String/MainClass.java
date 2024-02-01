package pkg26_String;

public class MainClass {
  
  public static void method1() {
    String str = "a";
    str += "b";
    str += "c";
    
    System.out.println(str);
  }
  
  public static void method2() {
    String str1 = "a";
    String str2 = "a" ;
    
    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));
  }
  
  public static void method3() {
    String str1 = new String("a");
    String str2 = new String("a");
    
    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));
  }
  
  public static void method4() {
    
    String str1 = "a";
    String str2 = "A";
    
    System.out.println(str1.equals(str2));
    System.out.println(str1.equalsIgnoreCase(str2));
  }
  
  public static void method5() {
    String str = "hello\n";
    
    System.out.println(str.length());
  }
  
  public static void method6() {
    String str = "hello";
    
    for(int i = 0; i < str.length(); i++) {
      System.out.println(str.charAt(i));
    }
  }
  
  public static void method7() {
    String str = "hello world apple";
    
    System.out.println(str.indexOf(" "));
    System.out.println(str.lastIndexOf(" "));
  }
  
  public static void method8() {
    String str = "hello world";
    
    int spaceIndex = str.indexOf(" ");
    
    for(int i = 0; i <str.length(); i++) {
      System.out.println(str.substring(i));
    }
    System.out.println();
    System.out.println();
    
    System.out.println(str.substring(0, spaceIndex));
    System.out.println(str.substring(spaceIndex + 1));
  }
  
  
  
  public static void main(String[] args) {
   method1();
   method2();
   method3();
   method4();
   method5();
   method6();
   method7();
   method8();
  }
}
