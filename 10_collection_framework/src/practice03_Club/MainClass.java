package practice03_Club;

public class MainClass {

  public static void main(String[] args) {
    
    Club club = new Club();
    
    Person p1 = new Person("1");
    Person p2 = new Person("2");
    Person p3 = new Person("3");
    Person p4 = new Person("4");
    Person p5 = new Person("5");
    
   //System.out.println(System.identityHashCode(p3));
    
    club.enterClub(p1);
    club.enterClub(p2);
    // p3 은 동일한 참조값을 가지고 있기 때문에 new Person("6")과 달리 동일한 값으로 인식한다.
    // new Person("6")은 생성할 때마다 다른 참조값을 지닌다.
    club.enterClub(p3);   
    club.enterClub(p3);
    club.enterClub(p3);
    club.enterClub(p4);
    club.enterClub(p5);
    club.enterClub(new Person("6"));
    club.enterClub(new Person("6"));
    // equals 오버라이드를 person 클래스에 넣어준 후 new Person("6")을 동일한 값으로 다시 인식한다.
    
    
    club.leaverClub(p1);
    
    club.poolList();
    
  }

}
