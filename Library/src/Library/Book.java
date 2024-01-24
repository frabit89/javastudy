package Library;

public class Book implements Library {
  
  private boolean isBorrow;
  private String bookName;
  private String isbn;
  private String writer;
  
  public Book() {

  }
  
  public Book(boolean isBorrow, String bookName, String isbn, String writer) {
    super();
    this.isBorrow = isBorrow;
    this.bookName = bookName;
    this.isbn = isbn;
    this.writer = writer;
  }

  public boolean isBorrow() {
    return isBorrow;
  }

  public void setBorrow(boolean isBorrow) {
    this.isBorrow = isBorrow;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  @Override
  public String toString() {
    return "Book [isBorrow=" + isBorrow + ", bookName=" + bookName + ", isbn=" + isbn + ", writer=" + writer + "]";
  }
  
  
  
  
  
}
