package pkg01_java_net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class03_HttpURLConnection {

  public static void main(String[] args) {
    
    String spec = "https://www.naver.com/";
    URL url = null;
    HttpURLConnection con = null;
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection)url.openConnection();  //부모URL을 자식Https로 바꿀때는 강제 downcasting필요
      
      /*
       * 접속 상태 확인 (HTTP Response Code : 응답 코드)
       * 1. 200 : 정상
       * 2. 4xx : 요청 문제 (클라이언트 문제)
       * 3. 5xx : 서버 문제
       */
      
      int responseCode = con.getResponseCode();
      
      if(responseCode == HttpURLConnection.HTTP_OK) {
        System.out.println("정상 접속");
      } else {
        System.out.println("접속 불가");
      }
      
      /*
       * Content-Type
       * 1. 컨텐트 타입
       * 2. 종류
       *    1) 문서 타입   : text/xxx
       *    2) 이미지 타입 : image/xxx
       *    3) 데이터 타입 : application/xxx
       */
      String contentType = con.getContentType();
      System.out.println(contentType);
      
      /*
       * 요청 메소드 (Request Method, 요청 방법)
       * 1. GET  : 주소창(URL)을 이용한 요청. 기본 요청 방식. 예) 검색 내용 
       * 2. POST : 본문(BODY)을 이용한 요청 예) 아이디, 비밀번호
       */
      
      String requestMethod = con.getRequestMethod();
      System.out.println(requestMethod);
      
      /*
       * 요청 헤더
       * 1. 요청 정보가 저장된다.
       * 2. 종류
       *    1) User-Agent     : 무엇으로 접속하였는지에 관한 정보
       *    2) Referer        : 이전 접속 주소 정보
       *    3) Content-Type   : 컨텐트 타입
       *    4) Content-Length : 컨텐트 크기
       */
//      Map<String, List<String>> requestHeader = con.getRequestProperties();
//      for(Entry<String, List<String>> entry : requestHeader.entrySet()) {
//        System.out.println(entry.getKey() + " : " + entry.getValue());
//      }
        String userAgent = con.getRequestProperty("User-Agent");
        System.out.println(userAgent);
        String referer = con.getRequestProperty("Referer");
        System.out.println(referer);
        
      
    } catch (MalformedURLException e) {   // 자식을 위에 두고
      e.printStackTrace();
    } catch (IOException e) {             // 부모를 나중에 배치
      e.printStackTrace();
    } finally {
      if(con != null) // 오류에 노출될 수 있다. url생성 시 오류가 발생하면 disconnect시 문제됨. 그러므로 if문 필요.
        con.disconnect();  
    }
    
  }

}
