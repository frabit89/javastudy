package pkg12_throw;

public class MainClass {

  public static void main(String[] args) {
    
    try {
      
      
      int score = 500;
      char grade;
      
      if(score < 0 || score >100) {
        throw new RuntimeException();
      }
      
      if(score >= 90) 
        grade = 'A';
      else if(score >= 80)
        grade = 'B';
      else if(score >= 70)
        grade = 'c';
      else if(score >= 60)
        grade = 'D';
      else
        grade = 'F';
      
      System.out.println(score + "," + grade);
    } catch (Exception e) {

      System.out.println("점수문제");
            
    }

  }

}
