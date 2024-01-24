package pkg05_Bus;

public class Bus {

  // field
  private Seat[] seats;
  private int numOfPerson;
  
  // constructor
  public Bus() {
   seats = new Seat[25];
   for(int i = 0; i < seats.length; i++) {
     seats[i] = new Seat();
   }
  }
  
  // 버스 타기
  public void on(Person person) {
    if(numOfPerson >= seats.length) {
      System.out.println("만석");
      return;
    }
    for(int i = 0; i < seats.length; i++) {
      if(seats[i].getPerson() == null) {
        seats[i].setPerson(person);
        numOfPerson++;
        break;
      }
    }
  }
  
  // 버스 내리기
  public void off(int seatNo) {
    if(seatNo <= 0 || seatNo > seats.length) {
      System.out.println("좌석 번호가 잘못되었습니다.");
      return;
    }
    seats[seatNo - 1].setPerson(null);
    numOfPerson--;
  }
  
  // 버스 탑승 명단
  public void info() {
    System.out.println("버스탑승명단");
    for(int i = 0; i < seats.length; i++) {
      Person person = seats[i].getPerson();
      if(person == null) {
        System.out.println(String.format("%02d", i + 1) + "번 좌석 비어있음");
      } else {
        System.out.println(String.format("%02d", i + 1) + "번 좌석" + person.getName());
      }
    }
  }
    
  
  
}
