package practice04_Car;

public class MainClass {
   public static void main(String[] args) {
     
     Driver driver1 = new Driver("elsa", 5);
     System.out.println(driver1.isBestDriver());
     
     Driver driver2 = new Driver();
     driver2.setName("elsa");
     driver2.setCareer(20);
     
     System.out.println(driver2.isBestDriver());
     
     Car car = new Car(driver2, 40, 100);
     
     car.engineStart();
     car.accelerator(5);
     car.brake(5);
   }

}
