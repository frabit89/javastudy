package pkg17_BankAccount;

public class BankAccount {

  // field
  private String accNo;
  private long balance;
  
  // constructor
  public BankAccount() {

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
  
  public void deposit(long money) throws RuntimeException{
    
      if(money <= 0) {
        throw new RuntimeException(money + "원 입금 불가");
      }
      balance += money;
  }
  
  // 1. 메소드마다 try - catch 넣기
  // 2. 메소드 호출한 곳으로 예외 던지기
  
  public long withdrawal(long money) throws RuntimeException{
    
     if(money <= 0) {
        throw new RuntimeException(money + "원 출금 불가");
      } 
      if (money > balance) {
        throw new RuntimeException("잔액 부족");
      }
      balance -= money;
      
    return money;
    
  }
  
  public void transfer(BankAccount account, long money) throws RuntimeException {
    
    // 내 통장에서 출금 -> 출금된 금액이 반환 -> 네 통장에 입금
    
    // 내 통장에서 출금
    // long a = withdrawal(money);
    
    // 네 통장에 입금
    // account.deposit(a);
    
    account.deposit(withdrawal(money));
    
  }
  
}
  
  
