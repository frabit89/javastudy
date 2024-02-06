//package parking;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class ParkingLot_My {
//
//  /* field 영역 수정 금지 */
//  private String name;
//  private List<Car> cars;
//  private Scanner sc;
//  public final static int LIMIT = 5;
//  
//  public ParkingLot_My(String name) {
//    
//    /* 구현부 */
//    sc = new Scanner(System.in);
//    this.name = name;
//    cars = new ArrayList<Car>(LIMIT);
//  }
//  
//  
//  public void addCar() throws RuntimeException {
//    /* 구현부 */
//    sc = new Scanner(System.in);
//    if(cars.size() == LIMIT) {
//      throw new RuntimeException("만차입니다. 더 이상 차량 등록이 불가능합니다.");
//    }
//    System.out.println("현재 등록된 차량 :" + cars.size());
//    System.out.println("차량번호 입력 >>>");
//    String carNo = sc.next();
//    System.out.println("모델 입력 >>>");
//    String carName = sc.next();
//    
//    Car newCar = new Car();
//    newCar.setCarNo(carNo);
//    newCar.setModel(carName);
//    cars.add(newCar);
//
//    System.out.println("차량번호 " + newCar.getCarNo() + " 차량이 등록되었습니다.");
//  }
//  
//  public void deleteCar() throws RuntimeException {
//    /* 구현부 */
//    sc = new Scanner(System.in);
//    System.out.println("삭제할 차량번호 입력 >>>");
//    String carNo = sc.next();
//    Car delCar = null;
//    for(Car car : cars) {
//      if(car.getCarNo().equals(carNo)) {
//        delCar = car;
//        break;
//      }
//    }
//    if(delCar == null) {
//      throw new RuntimeException( "차량이 존재하지 않습니다.");
//    }
//    if(carNo.isEmpty()) {
//      throw new RuntimeException("현재 주차장에 등록된 차량이 없습니다.");
//    }
//    cars.remove(delCar);
//    System.out.println("차량번호 " + carNo + " 이 삭제되었습니다.");
//  }
//  
//  public void searchCar() throws RuntimeException {
//    /* 구현부 */
//    sc = new Scanner(System.in);
//    System.out.println("조회할 차량번호 입력 >>>");
//    String carNo = sc.next().trim();
//    for(Car car : cars) {
//      if(car.getCarNo().equals(carNo)) {
//        System.out.println(car.toString());
//        return;
//      }
//    }
//    throw new RuntimeException(carNo + "차량이 존재하지 않습니다.");
//  }
//  
//  public void printAllCars() throws RuntimeException {
//    /* 구현부 */
//    sc = new Scanner(System.in);
//    int count = 1;
//    if(cars.isEmpty()) {
//      throw new RuntimeException("주차된 차량이 존재하지 않습니다");
//    }
//    for(Car car : cars) {
//      System.out.println(count + "번째 차량: Car [" + cars.toString() + "]");
//      count++;
//    }
//  }
//  
//  public void manage() {
//    /* 구현부 */
//    while(true) {
//      try {
//        System.out.println("\n1.추가 2.삭제 3.조회 4.전체조회 0.종료 >>>");
//        String choice = sc.next();
//        switch(choice) {
//        case"1":
//          addCar();
//          break;
//        case"2":
//          deleteCar();
//          break;
//        case"3":
//          searchCar();
//          break;
//        case"4":
//          printAllCars();
//          break;
//        case"0":
//          System.out.println("주차 시스템 종료");
//          return;          
//        default:
//          throw new RuntimeException("잘못된 입력입니다.");
//        }
//        
//      } catch (Exception e) {
//        System.out.println(e.getMessage());
//      }
//    }
//  }
//
//
//}