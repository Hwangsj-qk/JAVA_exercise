package loop.ex;

import java.util.Scanner;

public class Ex7 {
    // 최대공약수와 최소공배수 구하기
    // 두 개의 자연수를 입력받아, 유클리드 호제법을 사용하여
    // 최대 공약수(GCD)와 최소 공배수(LCM)를 찾는 프로그램을 작성하세요
    //최소 공배수는 두 수의 곱을 최대 공약수로 나눈 값으로 구할 수 있습니다.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 정수: ");
        int num2 = scanner.nextInt();

        int gcd, lcm;

        // 원본 숫자는 훼손되면 안됨.
        int original1 = num1;
        int original2 = num2;

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        gcd = num1;
        lcm = original1 * original2/gcd;
        System.out.println("최대공약수: " + gcd);
        System.out.println("최소공배수: " + lcm);
    }
}
