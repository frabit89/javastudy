package pkg18_BankAccount;

public class BankException {
  
  private int errorCode;

  public BankException(int errorCode) {
    super();
    this.errorCode = errorCode;
  }
  
  public BankException(String message, int errorCode) {
    super(message);
    this.errorCode = errorCode;
  }

  protected int getErrorCode() {
    return errorCode;
  }

  protected void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
  }
  
  
}
