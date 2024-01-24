package pkg07_Interface;

public class MainClass {

  public static void main(String[] args) {

    Shape shape1 = new Circle(0, 0, 1.5);
    
    System.out.println(shape1.getArea());
    System.out.println(shape1.getCircum());
    
    shape1.whoami("원");
    Shape.whoami2("원");
    
    Shape shape2 = new Rectangle(0, 0, 2, 3);
    
    System.out.println(shape2.getArea());
    System.out.println(shape2.getCircum());
    
    shape2.whoami("사각형");
    Shape.whoami2("사각형");
    
  }

}
