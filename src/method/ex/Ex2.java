package method.ex;

import java.util.Scanner;

public class Ex2 {
    // 세 수를 입력받아 합계와 평균을 구하는 메소드를 만들어주세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.print("세번째 정수를 입력하세요: ");
        int num3 = scanner.nextInt();

        System.out.println("====== 계산 결과 입니다 =====");
        System.out.println("합계: " + sum(num1, num2, num3));
        System.out.println("평균: " + sum(num1, num2, num3)/3 );

    }
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
