package pkg06_abstract;

public class Rectangle extends Shape{

  private double x1;
  private double x2;
  private double y1;
  private double y2;
  
  public Rectangle() {
    // TODO Auto-generated constructor stub
  }

  public Rectangle(String name, double x1, double x2, double y1, double y2) {
    super(name);
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;
  }

  protected double getX1() {
    return x1;
  }

  protected void setX1(double x1) {
    this.x1 = x1;
  }

  protected double getX2() {
    return x2;
  }

  protected void setX2(double x2) {
    this.x2 = x2;
  }

  protected double getY1() {
    return y1;
  }

  protected void setY1(double y1) {
    this.y1 = y1;
  }

  protected double getY2() {
    return y2;
  }

  protected void setY2(double y2) {
    this.y2 = y2;
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
