package pkg23_Cart;

public class MainClass {

  public static void main(String[] args) {
    
    try {
      
      Customer customer = new Customer(10000);
      
      Cart cart = new Cart(10);
      
      customer.setCart(cart);
      
      customer.addToCart(new Product("A", 3000));
      customer.addToCart(new Product("B", 1000));
      customer.addToCart(new Product("C", 1500));
      customer.addToCart(new Product("D", 1700));
      customer.addToCart(new Product("E", 2300));
      
      String receipt = customer.buy();
      System.out.println(receipt);

      System.out.println("고객돈" + customer.getMoney() + "원");
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      
    }
    
  }

}
