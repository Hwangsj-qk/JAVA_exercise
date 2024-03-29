package class0.class1.ex.ex6;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 객체지향 코드로 변경

        // 계산기 생성
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        char op;

        // 값 입력받기
        calculator.inputNumber();

        // 연산자 받기
        op = calculator.inputOperator();

        // 연산하고 출력하기
        calculator.printCalculateNumber(op);

    }


}
