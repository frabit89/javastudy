package pkg07_Interface;

public class Circle implements Shape {
  
  double PI = 3.141592;
  private double x;
  private double y;
  private double radius;
  
  public Circle() {
    // TODO Auto-generated constructor stub
  }

  public Circle(double x, double y, double radius) {
    super();
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  protected double getX() {
    return x;
  }

  protected void setX(double x) {
    this.x = x;
  }

  protected double getY() {
    return y;
  }

  protected void setY(double y) {
    this.y = y;
  }

  protected double getRadius() {
    return radius;
  }

  protected void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    // TODO Auto-generated method stub
    return PI * Math.pow(radius, 2);
  }

  @Override
  public double getCircum() {
    // TODO Auto-generated method stub
    return 2 * PI * radius;
  }
  
  
  

}
