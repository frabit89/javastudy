package pkg03_return;

public class Adder {
  int total = 0;
  int add(int... params) {
    for(int param : params) {
      total += param;
    }
    return total;
  }
  
}
