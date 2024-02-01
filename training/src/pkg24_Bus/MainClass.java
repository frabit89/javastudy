package pkg24_Bus;

public class MainClass {

  public static void main(String[] args) {
    try {
      Bus bus = new Bus();
      
      bus.on(new Woman("a"));
      bus.on(new Woman("b"));
      bus.on(new Man("f"));
      bus.on(new Woman("c"));
      bus.on(new Man("g"));
      
      bus.info();
      
      bus.off(2);
      bus.off(3);
      
      bus.on(new Man("h"));
      bus.on(new Woman("d"));
      bus.on(new Man("i"));
      
      bus.info();
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

}
