package pkg08_Object;

public class Student {
  
  // field
  private int StuNo;
  private String name;
  private Book[] books;
  private int bookCount;
  
  // Constructor
  public Student() {
    books = new Book[100];
  }

  public Student(int stuNo, String name) {
    super();
    StuNo = stuNo;
    this.name = name;
    books = new Book[100];
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
    
    /*
     * Object 클래스의 equals() 메소드 오버라이드
     * stuNo 필드 값이 일치하면 true 반환
     */
    
  }
  
  // 책 삭제 (오버로딩)
  public void removeBook(Book book) {
    
    if(bookCount == 0) {
      System.out.println("저장된 책이 없습니다.");
      return;
    }
    
    for(int i = 0; i < bookCount; i++) {
      if(book.equals(books[i])) { // 저장된 책 books[i]과 들어온 책 book 이 같을 때
                                  // Book 클래스에 Object 클래스의 equals 메소드 오버라이드 해야 한다.(isbn이 같으면 true 반환)
        System.arraycopy(books, i + 1, books, i, bookCount - i - 1);
        bookCount--;
        books[bookCount] = null;
        break;
      }
    }
    
    
  }
  
  @Override
  public boolean equals(Object obj) {
    if(obj == null) return false;
    if(obj == this) return true;
    return this.StuNo == ((Student)obj).StuNo;
  }
  
  /* Object 클래스의 toString() 메소드 오버라이드
   * "stuNo: 10101, name: 고길동" 형식의 문자열 반환
   */
  
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "stuNo: " + StuNo + ", name: " + name;
  }
  
  
  
  
  
  
}