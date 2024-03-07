package operator.ex;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 사용자로부터 두 점수를 입력받아, 두 점수 중 큰 값을 출력하는  프로그램을 작성하세요.
        // 이때, 조건 연산자(삼항 연산자)를 이용하여 구현하세요.

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        int greater = (num1 > num2) ? num1 : num2;
        System.out.println("큰 값: " + greater);
    }
}
