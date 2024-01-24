package pkg03_Object;

public class MainClass {

  public static void main(String[] args) {
    
    Object obj = new Book("979-11-6224-187-5", "혼자 공부하는 자바");
    
    System.out.println( ((Book)obj).getIsbn());
    System.out.println( ((Book)obj).getTitle());
    
    Book book = new Book("979-11-6224-187-5", "혼자 공부하는 자바");
    
    System.out.println(obj.equals(book));
    System.out.println(book.toString());
    System.out.println(book);
    System.out.println();
    
    
    Student student1 = new Student(10101, "고길동");
    Student student2 = new Student(10101, "고길동");
    
    System.out.println(student1.equals(student2));
    System.out.println(student1);
    
    student1.addBook(new Book("979-11-6224-187-5", "혼자 공부하는 자바"));
    student1.addBook(new Book("979-11-6224-187-6", "혼자 공부하는 자4"));
    student1.addBook(new Book("979-11-6224-187-7", "혼자 공부하는 자3"));
    student1.addBook(new Book("979-11-6224-187-8", "혼자 공부하는 자2"));
    student1.addBook(new Book("979-11-6224-187-9", "혼자 공부하는 자1"));
    
    for(Book b : student1.getBooks()) {
      if(b != null) {
        System.out.println(b);
      }
    }
    
    student1.removeBook(new Book("979-11-6224-187-5", "혼자 공부하는 자바"));
    
    for(Book b : student1.getBooks()) {
      if(b != null) {
        System.out.println(b);
      }
    }
  }

}
