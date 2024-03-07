package loop.ex;

import java.util.Scanner;

public class Ex3 {
    // 구구단 출력하기
    // 사용자로부터 정수 n을 입력받아,
    // n단의 구구단을 출력하는 프로그램을 작성해주세요.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출력할 단수를 입력하세요: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 9 ; i++) {
            System.out.println(num + " * " + i + " = " + (num *i));
        }
    }
}
