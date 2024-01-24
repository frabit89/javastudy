package pkg05_Bus;

public class MainClass {

  public static void main(String[] args) {
    Bus bus = new Bus();
    bus.on(new Woman("A1"));
    bus.on(new Man("B1"));
    bus.on(new Woman("A1"));
    bus.on(new Woman("A2"));
    bus.on(new Man("B2"));
    bus.on(new Woman("A3"));
    bus.on(new Woman("A4"));
    bus.on(new Woman("A5"));
    bus.on(new Man("B3"));
    bus.on(new Man("B4"));
    
    bus.info();

    bus.off(1);
    bus.off(2);
    bus.off(3);
    bus.off(4);
    
    bus.on(new Man("B5"));
    bus.on(new Woman("A6"));
    
    bus.info();
    
  }

}
