package class0.class1.ex.ex6;

import java.util.Scanner;

public class Calculator {
    // 필드: 계산기와 관련된 데이터
    int num1;
    int num2;
    char operator;

    // 메서드 : 계산기와 관련된 기능

    int add() {
        return num1 + num2;
    }

    int subtract() {
        return num1 - num2;
    }

    int multiply() {
        return num1 * num2;
    }

    double divide() {
        if(num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        } else {
            return num1 / num2;
        }
    }

    // 두 숫자를 받는 메서드
    void inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요: ");
        num1 = scanner.nextInt();
        System.out.print("두번째 숫자를 입력하세요: ");
        num2 = scanner.nextInt();

    }

    // 연산자를 받는 메서드
    char inputOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("원하는 연산자를 입력해주세요: ");
        return scanner.next().charAt(0);
    }

    // 계산하는 메서드
    void printCalculateNumber (char op) {
        switch (op) {
            case '+' :
                System.out.println("결과: " + add());
                break;

            case '-' :
                System.out.println("결과: " + subtract());
                break;

            case '*' :
                System.out.println("결과: " + multiply());
                break;

            case '/' :
                System.out.println("결과: " + divide());
                break;

            default:
                System.out.println("알맞지 않은 연산자입니다. ");
        }
    }
}
