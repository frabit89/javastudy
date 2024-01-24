package pkg06_abstract;

public class Circle extends Shape {

  private double x;
  private double y;
  private double radius;
  
  public Circle() {
    // TODO Auto-generated constructor stub
  }



  public Circle(String name, double x, double y, double radius) {
    super(name);
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
    return 0;
  }

  @Override
  public double getCircum() {
    // TODO Auto-generated method stub
    return 0;
  }
  
  
  
  
}
