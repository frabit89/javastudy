package pkg03_Object;

import java.util.Arrays;
import java.util.Objects;

public class Student {

  // field
  private int stuNo;
  private String name;
  private Book[] books;
  private int bookCount;
  
  // constructor
  public Student() {
    books = new Book[100];
  }

  public Student(int stuNo, String name) {
    super();
    this.stuNo = stuNo;
    this.name = name;
    books = new Book[100];
  }

  // method
  public int getStuNo() {
    return stuNo;
  }

  public void setStuNo(int stuNo) {
    this.stuNo = stuNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Book[] getBooks() {
    return books;
  }

  public void setBooks(Book[] books) {
    this.books = books;
  }

  public int getBookCount() {
    return bookCount;
  }

  public void setBookCount(int bookCount) {
    this.bookCount = bookCount;
  }

  // 책 등록
  public void addBook(Book book) {
    
    if(bookCount >= books.length) {
      System.out.println("더 이상 책을 등록할 수 없습니다.");
      return;
    }
    books[bookCount++] = book;
  }
  
  // 책 삭제
  public void removeBook(int idx) {
    if(idx < 0 || idx >= bookCount) {
      System.out.println("잘못된 인덱스입니다.");
      return;
    }
    System.arraycopy(books, idx + 1, books, idx, bookCount - idx - 1);
    bookCount--;
    books[bookCount] = null;
    
  }
  
  
  public void removeBook(Book book) {
    
    if(bookCount == 0) {
      System.out.println("저장된 책이 없습니다.");
      return;
    }
    //5 //0 1 [2] 3 4 
    for(int i = 0; i < bookCount; i++) {
      if(book.equals(books[i])) {
        System.arraycopy(books, i + 1, books, i, bookCount - i - 1);
        // books(원본배열) 에서 i+1(원본시작인덱스)부터 시작해서 
        //bookCount-i-1개(복사길이)의 요소를 i(대상시작인덱스) 위치부터 시작하는 배열 
        //books(복사된 요소들이 저장될 대상배열)로 복사
        
        bookCount--;
        books[bookCount] = null;
        break;
      }
    }
  }

  @Override
  public String toString() {
    return "Student [stuNo=" + stuNo + ", name=" + name + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Student other = (Student) obj;
    return bookCount == other.bookCount && Arrays.equals(books, other.books) && Objects.equals(name, other.name)
        && stuNo == other.stuNo;
  }
  

  
  
  
  
  
  
  
  
  
  
  
  
  

}
 