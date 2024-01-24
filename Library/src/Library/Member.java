package Library;

import java.util.List;

public class Member implements Library{
  
  List<Book> books;
  private int memberID;
  
  // constructor
  public Member() {
    // TODO Auto-generated constructor stub
  }
  
  public Member(List<Book> books, int memberID) {
    super();
    this.books = books;
    this.memberID = memberID;
  }
  
  // method
  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }

  public int getMemberID() {
    return memberID;
  }

  public void setMemberID(int memberID) {
    this.memberID = memberID;
  }
  
  @Override
  public String toString() {
    return "Member [books=" + books + ", memberID=" + memberID + "]";
  }

  

  public void borrowBook() {
    
  }
  
  public void returnBook() {
  
  }


   
  
  
  
}
