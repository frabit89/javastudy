package pkg01_polymorphysm;

public class MainClass {

  public static void main(String[] args) {
    Tv tv = new Tv();
    Radio radio = new Radio();
    
    Person person = new Person();
    
    person.powerOn(radio);
    person.powerOn(tv);
    

  }

}
