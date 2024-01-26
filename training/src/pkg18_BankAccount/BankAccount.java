package pkg18_BankAccount;

public class BankAccount {

  // field
  private String accNo;
  private long balance;
  
  public BankAccount() {
    // TODO Auto-generated constructor stub
  }

  public BankAccount(String accNo, long balance) {
    super();
    this.accNo = accNo;
    this.balance = balance;
  }

  // method
  public String getAccNo() {
    return accNo;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }
  
  
  public void deposit(long money) throws RuntimeException {
    
    try {
      if(money <= 0) {
        throw new DepositException(1001);
      }
      
      balance += money;
      
    } catch (DepositException e) {
      throw new RuntimeException(money + "원 입금 불가", e);
      
    }
    
    
  }
  
  public long withdrawal(long money) throws RuntimeException {
    
    try {
      
      if(money <= 0) {
        throw new WithdrawalException(2001);
      }
      if(money > balance) {
        throw new WithdrawalException(2002);
      }
      balance -= money;
      
    } catch (WithdrawalException e) {

      String message = null;
      switch(e.getErrorCode()) {
      case 2001:
        message = money + "원 출금 불가";
        break;
      case 2002:
        message = "잔액 부족";
        break;
      }
      
      throw new RuntimeException(message, e);
      }
      return money;
    
    
  }
  
  public void transfer(BankAccount account, long money) throws RuntimeException {
    long a = withdrawal(money);
    account.deposit(a);
    
    account.deposit(withdrawal(money));
  }


  
  
  
  
  
}
