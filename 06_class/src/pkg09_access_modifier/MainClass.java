package pkg09_access_modifier;

public class MainClass {

  public static void main(String[] args) {
    
    // computer 객체 선언 및 생성
    Computer computer = new Computer("galaxybook", 400, new Calculator());
    
    //System.out.println(computer.model);
    //model 이 private 으로 설정되어 있어서 직접 접근 불가
    //develop()메소드를 통해 간접 접근은 가능

    // 필드로 값을 전달하는 메소드
    computer.setModel("gram");
    computer.setPrice(200);
    computer.setCalculator(new Calculator());
    
    
    // 필드값을 가져오는 메소드
    System.out.println(computer.getModel());
    System.out.println(computer.getPrice());
    computer.getCalculator().add();
    computer.getCalculator().add(3,4);
    computer.getCalculator().add(3,4,5);
  }

}
