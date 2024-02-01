package pkg24_Bus;

import java.util.ArrayList;
import java.util.List;

public class Bus {
  private List<Seat> seats;
  public static final int LIMIT = 25;
  private int numOfPerson;
  
  public Bus() {
   seats = new ArrayList<Seat>(LIMIT);
   for(int i = 0; i < LIMIT; i++) {
     seats.add(new Seat());
   }
  }
  
  
  
  public void on(Person person) throws RuntimeException{
    if(numOfPerson >= LIMIT) {
      throw new RuntimeException("만석입니다.");
    }
    for(int i = 0; i < LIMIT; i++) {
      Seat seat = seats.get(i);
      if(seat.getPerson() == null) {
        seat.setPerson(person);
        numOfPerson++;
        break;
      }
    }
  }
  
  public void off(int seatNo) throws RuntimeException{
    if(seatNo <= 0 || seatNo > LIMIT) {
      throw new RuntimeException("좌석 번호가 잘못 전달됨");
    }
    seats.get(seatNo - 1).setPerson(null);
    numOfPerson--;
  }
  
  public void info() {
    System.out.println("====탑승 목록 확인=====");
    for(int i = 0; i < LIMIT; i++) {
      Person person = seats.get(i).getPerson();
      if(person == null) {
        System.out.println(String.format("%2d", i + 1) + "번 좌석 비어있음");
      } else {
        System.out.println(String.format("%2d", i +1 ) + "번 좌석 " + person.getName());
      }
    }
  }
  
  
}
