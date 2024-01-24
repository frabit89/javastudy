package pkg04_overloading;

public class Adder {
  
//  int add(int... params) {
//    int total = 0;
//    for(int param : params) {
//      total += param;
//    }
//    return total;
//  }
    int add(int[] arr) {
      int total = 0;
      for(int n : arr) {
        total += n;
      }
      return total;
    }
    
    double add(double[] arr) {
      double total = 0.0;
      for(double n : arr) {
        total += n;
      }
      return total;
    }
  
}
