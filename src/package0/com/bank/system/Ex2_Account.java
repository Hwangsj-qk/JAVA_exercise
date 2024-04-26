package package0.com.bank.system;

public class Ex2_Account {
    public static void main(String[] args) {
        Account account = new Account();

        // 통장 기본 계좌 : 100000원
        account.setBalance(100000);

        // 기존 통장에 10000원 입금
        account.deposit(10000);

        // 통장에 잔액 출력
        account.getBalance();

        // 통장에서 20000원 출금
        account.withdraw(20000);

        // 통장에서 100만원 출금 => 잔액 부족
        account.withdraw(1000000);
    }
}
