package class0.class1.ex.ex9;

public class BankAccount {
    // 필드
    String accountNumber;
    String ownerName;
    int balance;

    // 메서드

    // 1. 입금 메서드
    long deposit(int amount) {
        balance+= amount;
        System.out.println(amount + "원을 입금했습니다. 잔액은 " + balance + "원입니다. ");
        return balance;
    }

    // 2. 출금 메서드
    long withdraw(int amount) {
        if(balance < amount) {
            System.out.println("잔액 부족! 출금할 수 없습니다. ");
        } else {
            balance -=amount;
            System.out.println(amount + "원을 출금했습니다. 잔액은 " + balance + "원입니다. ");
        }
        return balance;
    }

    // 3. 잔액 조회
    long getBalance() {
        System.out.println("잔액은 " + balance + "원입니다. ");
        return balance;
    }

}
