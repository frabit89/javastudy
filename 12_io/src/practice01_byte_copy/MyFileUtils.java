package practice01_byte_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyFileUtils {

  // 파일 복사 메소드 내용과 위치
  public static void fileCopy(String src, String dest) {
    
    // src로부터 읽은 데이터를 바이트 배열에 저장하고,
    // 바이트 배열에 있는 데이터를 파일 출력 스트림으로 보내는 방식
    
    File srcFile = new File(src);
    File destFile = new File(dest);
    
    BufferedInputStream in = null;
    BufferedOutputStream out = null;
    
    try {
      in = new BufferedInputStream(new FileInputStream(srcFile));
      out = new BufferedOutputStream(new FileOutputStream(destFile));
      byte[] bytes = new byte[5];
      int readByte = 0;
      while((readByte = in.read(bytes)) != -1) {
        out.write(bytes, 0, readByte);
      }
      
      out.close();
      in.close();
      
    } catch (Exception e) {
      e.getStackTrace();
    }
  }
  
  
  // 파일 이동 메소드 어디에서 어디로
  public static void fileMove(String src,String dest) {
    
    fileCopy(src, dest);
    new File(src).delete();
    
  }
  
  
}
