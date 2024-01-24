package Library;

import java.util.List;

public class ManagementSystem implements Library {

    List<Book> books;
    
  public void incomingBooks(List<String> bookTitles) {
    // 책 입고 처리
    System.out.println("Incoming books: " + bookTitles);
  }

  public void outgoingBooks(List<String> bookTitles) {
    // 책 출고 처리
    System.out.println("Outgoing books: " + bookTitles);
  }

  public void discardBooks(List<String> bookTitles) {
    // 책 폐기 처리
    System.out.println("Discarding books: " + bookTitles);
  }
  
  public static void main(String[] args) {

    ManagementSystem librarySystem = new ManagementSystem();
    librarySystem.incomingBooks(List.of("Book1", "Book2"));
    librarySystem.outgoingBooks(List.of("Book3"));
    librarySystem.discardBooks(List.of("Book4"));
}
  
  
  
  
}
