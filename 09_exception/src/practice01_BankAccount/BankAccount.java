package practice01_BankAccount;

public class BankAccount {
  //field
  private String accNo; //계좌번호
  private long balance; //잔액
  
  public BankAccount() {
  }  
  
  public BankAccount(long balance) {
    this.balance = balance;
  }
  public BankAccount(String accNo) {
    this.accNo = accNo;
  }

  public BankAccount(String accNo, long balance) {
    this.accNo = accNo;
    this.balance = balance;
  }
  
  //Setter
  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }
  public void setBalance(long balance) {
    this.balance = balance;
  }
  public String getAccNo() {
    return accNo;
  }
  public long balance() {
    return balance;
  }
 
  // 1. 메소드마다 try - catch 넣기
  // 2. 메소드 호출한 곳으로 예외 던지기

  
    public void deposit(long money) {
//  public void deposit(long money) throws ArithmeticException {
    try {
      if(money <= 0) {
        throw new RuntimeException(money + "원 입금 불가");
    } 
      balance += money;
           
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
    }
    
  
  public long withdrawal(long money) {
    
    long retValue = 0L;
    
    try {
      if(money <=0) {
        throw new RuntimeException(money + "원 출금 불가");
      }
      if(money > balance) {
        throw new RuntimeException("잔액 부족");
      }

      balance -= money;
      retValue = money;

      } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
    
    return retValue;
    
  }
    
  
  public void transfer(BankAccount account, long money) {
    
    // 내 통장에서 출금 -> 출금된 금액이 반환 -> 네 통장에 입금
    
    // 내 통장에서 출금
    //long a = withdrawal(money);
    //long b = this.withdrawal(money)
    
    // 네 통장에 입금
    //account. deposit(a);
    
    account.deposit(withdrawal(money));
  }
  
  
  
  
  
  
  
  
}
