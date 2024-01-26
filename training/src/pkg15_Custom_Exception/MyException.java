package pkg15_Custom_Exception;

public class MyException extends Exception{
  
  // field
  private int errorCode;
  
  // constructor
  public MyException(String message, int errorCode) {
    super(message); // public Exception(String message) { } 생성자 호출
    this.errorCode = errorCode;
  }
  
  // method
  protected int getErrorCode() {
    return errorCode;
  }

  protected void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
  }
  
  
}
