package practice01_byte_copy;

public class MainClass {

  public static void main(String[] args) {
    
    MyFileUtils.fileCopy("C:\\Program Files\\Java\\jdk-17\\LICENSE", "\\storage\\LICENSE");
    MyFileUtils.fileMove("\\storage\\LICENSE", "\\GDJ77\\LICENSE");
    
    
  }

}

