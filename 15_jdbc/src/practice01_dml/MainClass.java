package practice01_dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javax.security.sasl.SaslException;

public class MainClass {

  /*
   * TALK_T 테이블에 1행씩 삽입하시오. 
   * TALK_T 구조
   *    TALK_NO       NUMBER (PK)
   *    TALK_CONTENT  VARCHAR2(1000 BYTE)  //인삿말
   *    TALK_USER   VARCHAR2(1000 BYTE) //  이름
   *    WRITEN_AT    TIMESTAMP (* 현재 날짜/시간 : CURRENT_TIMESTAMP)
   * TALK_SEQ 시퀀스 존재함
   * DB 서버 환경
   *    192.168.0.214
   *    GD/1111
   */
  
  public static void main(String[] args) {
    
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      //-Djdbc.url=jdbc:oracle:thin:@192.168.0.214:1521:xe
      //-Djdbc.user=GD
      //-Djdbc.password=1111
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");

      con = DriverManager.getConnection(url, user, password);
      
      String sql = "INSERT INTO TALK_T(TALK_NO, TALK_CONTENT, TALK_USER, WRITEN_AT) VALUES(TALK_SEQ.NEXTVAL, ?, ?, CURRENT_TIMESTAMP)";
      
      ps = con.prepareStatement(sql);
      
      Scanner sc = new Scanner(System.in);
      System.out.println("내용 입력하세요>>>");
      String talkContent = sc.next();
      System.out.println("");
      String talkUser = sc.next();
      
      ps.executeUpdate();
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(ps != null) ps.close();
        if(con!= null) con.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
    
    
    
  }

}
