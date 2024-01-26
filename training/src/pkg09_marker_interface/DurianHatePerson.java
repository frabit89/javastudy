package pkg09_marker_interface;

public class DurianHatePerson {
  public void eat(Eatable eatable) {
    ((Food)eatable).eat();
  }
}
