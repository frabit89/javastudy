package pkg23_Cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

  private List<Product> products;

  public Cart(int cartSize) {
    products = new ArrayList<Product>(cartSize);
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }
  
  public void addProduct(Product product) throws RuntimeException {
    if(product == null) {
      throw new RuntimeException("카트에 담을 물건이 없습니다.");
    }
    products.add(product);
  }
  
  public void changeProduct(int idx, Product product) throws RuntimeException{
    if(products.size() == 0) {
      throw new RuntimeException("카트가 비어 있습니다.");
    }
    if(product == null) {
      throw new RuntimeException("카트에 담을 물건이 없습니다.");
    }
    if(idx < 0 || idx > products.size()) {
      throw new RuntimeException("물건 번호가 잘못되었습니다.");
    }
    products.set(idx, product);
  }
  
  public void removeProduct(int idx) {
    if(products.size() == 0) {
      throw new RuntimeException("카트가 비어 있습니다.");
    }
    if(idx < 0 || idx > products.size()) {
      throw new RuntimeException("물건 번호가 잘못되었습니다.");
    }
    products.remove(idx);
  }
  
  
}
