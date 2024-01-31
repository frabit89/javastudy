package pkg23_Cart;

public class Customer {
  
  private int money;
  private Cart cart;
  
  public Customer() {
  }

  public Customer(int money) {
    super();
    this.money = money;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }

  public void addToCart(Product product) throws RuntimeException{
    cart.addProduct(product);
  }
  
  public void changeCart(int idx, Product product) throws RuntimeException{
    cart.changeProduct(idx, product);
  }
  
  public void removeCart(int idx) throws RuntimeException{
    cart.removeProduct(idx);
  }
  
  public String buy() {
    
    String receipt = "영수증\n";
    int total = 0;
    
    for(int i = 0, count = cart.getProducts().size(); i < count; i++) {
      Product product = cart.getProducts().get(i);
      
      total += product.getPrice();
      if(money < total) {
        System.out.println("구매금액 부족");
        return null;
      }
      
      receipt += product.getName();
      receipt += "....";
      receipt += product.getPrice();
      receipt += "\n";
    }
    
    money -= total;
    
    receipt += "총 구매액......" + total + "\n";
    
    return receipt;
  }
  
  
  
  
  
}
