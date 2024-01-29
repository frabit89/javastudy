package pkg18_BankAccount;

public class MainClass {
  
  public static void main(String[] args) {
    
  // 생성자
  BankAccount account1 = new BankAccount();
  
  // Setter
  account1.setAccNo("01098765432");
  account1.setBalance(100000);
  
  // 생성자
  BankAccount account2 = new BankAccount("01012345678", 50000);
  
  try {
    account1.deposit(100000);
    account1.deposit(-50000);
    
    long money;
    money = account1.withdrawal(100000);
    System.out.println(money);
    money = account1.withdrawal(200000);
    System.out.println(money);
    
    account1.transfer(account2, 50000);
    account1.transfer(account2, 100000);
    
  } catch (RuntimeException e) {
    String message = e.getMessage();
    System.out.println(message);
    
    BankException cause = (BankException) e.getCause();
    System.out.println(cause.getClass().getName());
    System.out.println(cause.getErrorCode());
  }
    
    
  }
}
