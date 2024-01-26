package pkg01_java_net;

import java.net.MalformedURLException;
import java.net.URL;

public class Class02_URL {
  
  public static void main(String[] args) {
    
    try {
      
      URL url = new URL("https://www.example.com:9090/webtoon/list?page=1&id=100#memo");
      
      System.out.println(url.getProtocol());
      System.out.println(url.getHost());
      System.out.println(url.getPort());
      System.out.println(url.getPath());
      System.out.println(url.getQuery());
      System.out.println(url.getRef());
      
      //url.openConnection()  url 접속할 때 필요한 클래스
      //url.openStream()      커낵션 얻은 뒤 스트림 얻는 클래스
      
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    
  }
  
}
