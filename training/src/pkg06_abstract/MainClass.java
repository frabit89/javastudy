package pkg06_abstract;

public class MainClass {

  public static void main(String[] args) {
    Shape shape1 = new Circle("원", 0, 0, 1.5);
    
    System.out.println("Name : " + shape1.getName());
    
    if(shape1 instanceof Circle) {
      System.out.println(((Circle) shape1).getX());
      System.out.println(((Circle) shape1).getY());
      System.out.println(((Circle) shape1).getRadius());
    }
    System.out.println(shape1.getArea());
    System.out.println(shape1.getCircum());
  }
  
  
  
  
}
