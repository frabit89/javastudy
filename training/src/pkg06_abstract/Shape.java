package pkg06_abstract;

public abstract class Shape {
  
  private String name;
  
  public Shape() {
    // TODO Auto-generated constructor stub
  }

  public Shape(String name) {
    super();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public abstract double getArea();
  
  public abstract double getCircum();
}
