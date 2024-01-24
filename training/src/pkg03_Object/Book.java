package pkg03_Object;

import java.util.Objects;

public class Book {
  
  //field
  private String isbn;
  private String title;
  
  //constructor
  public Book() {
    // TODO Auto-generated constructor stub
  }

  public Book(String isbn, String title) {
    super();
    this.isbn = isbn;
    this.title = title;
  }

  //method
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Book [isbn=" + isbn + ", title=" + title + "]";
  }

  @Override
  public int hashCode() {
    return Objects.hash(isbn);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj;
    return Objects.equals(isbn, other.isbn);
  }
  
  
  
  
}
