package practice02_text_copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyFileUtils {

  public static void fileCopy(File src, File dest) {
    
    // BufferedReader : File src 읽는 역할
    // BufferedWriter : File dest 만드는 역할
    
    try(BufferedReader in = new BufferedReader(new FileReader(src));
        BufferedWriter out = new BufferedWriter(new FileWriter(dest));) 
    { 
      // 읽기
      char[] cbuf = new char[256];
      int readChar = 0;
      
      // in.read(cbuf) -> out.write(cbuf)
      
      // 데이터 저장소
      //StringBuilder builder = new StringBuilder();
      
      
      while( ((readChar = in.read(cbuf)) != -1) ) {
        out.write(cbuf, 0, readChar);
      }
      //out.appen(builder.toString());
      
      
    } catch (IOException e) {
      e.printStackTrace();
    }    

  }
  
  public static void fileMove(File src, File dest) {
    
    fileCopy(src, dest);
    src.delete();
  }
  
}