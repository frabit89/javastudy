package pkg08_intermedia_method;

public class Book {

  // field
  private String title;
  private String author;
  private int price;
  
  // constructor
  public Book() {

  }

  public Book(String title, String author, int price) {
    super();
    this.title = title;
    this.author = author;
    this.price = price;
  }
  
  // method
  protected String getTitle() {
    return title;
  }

  protected void setTitle(String title) {
    this.title = title;
  }

  protected String getAuthor() {
    return author;
  }

  protected void setAuthor(String author) {
    this.author = author;
  }

  protected int getPrice() {
    return price;
  }

  protected void setPrice(int price) {
    this.price = price;
  }
  
  
  
}
