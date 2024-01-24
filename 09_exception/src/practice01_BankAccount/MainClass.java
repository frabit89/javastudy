package practice01_BankAccount;

public class MainClass {
  
  public static void main(String[] args) {
    
    //생성자
    BankAccount account1 = new BankAccount();
    
    //Setter
    account1.setAccNo("01098765432");
    account1.setBalance(200000);
    
    //생성자
    BankAccount account2 = new BankAccount("01012345678", 50000); //계좌번호, 잔액
    
    System.out.println(account1.getAccNo());
    System.out.println(account1.balance());
    ///////

      
      account1.deposit(3000000); //10만원 입금 (성공)
      account1.deposit(-50000000); //-5만원 입금 (실패)
      

    
    long money;

      money = account1.withdrawal(50000); //10만원 출금 (성공)
      System.out.println(money);           //100000 (출금된 금액 출력)
      money = account1.withdrawal(2000000); //20만원 출금 (실패)
      System.out.println(money);           //0 (출금된 금액 출력)
      

    
    
    ////////
    
    account1.transfer(account2, 50000);   // account1 -> account2, 50000원 이체 (성공)
    account1.transfer(account2, 1000000);  // account1 -> account2, 100000원 이체 (실패)
    
  }
  
}
