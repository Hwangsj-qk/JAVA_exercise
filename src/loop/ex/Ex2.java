package loop.ex;

import java.util.Scanner;

public class Ex2 {
    // 팩토리얼 계산하기
    // 사용자로부터 정수 n을 입력받아, n!(팩토리얼)의 값을 계산하는 프로그램을 작성하세요.
    // while 반복문을 사용하여 구현합니다
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("팩토리얼을 구할 숫자를 입력하세요: ");
        int n = scanner.nextInt();
        int factorial = 1;

        // 감소 연산자 사용
        while (n > 0) {
            factorial *= n;
            n--;
        }
        System.out.println("factorial = " + factorial);

        // 증가 연산자 사용
        int i = 1;

        while (i == n) {
            factorial *= n;
            i++;
        }
        System.out.println("factorial = " + factorial);
    }
}
