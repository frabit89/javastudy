package pkg05_marker_interface;

public class MainClass {

  public static void main(String[] args) {
    Person person = new Person();
    person.eat(new AppleMango());
    person.eat(new PineApple());
    person.eat(new Durian());
    System.out.println();
    DurianHatePerson durianHatePerson = new DurianHatePerson();
    durianHatePerson.eat(new AppleMango());
    durianHatePerson.eat(new PineApple());
    //durianHatePerson.eat(new Durian());   
    // 컴파일 오류를 통해 두리안을 받지 못하게 하고 싶음
    
  }

}
