package operator.ex;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // 산술 연산자
        // 두 개의 정수 a와 b를 사용자로부터 입력받습니다.
        // 이 두 수에 대해 더하기, 빼기, 곱하기, 나누기, 나머지 연산자를 수행하고 결과를 출력하는 프로그램 작성하세요

        Scanner scanner = new Scanner(System.in); // 입력받는 스캐너
        System.out.print("a: ");
        int a = scanner.nextInt(); // 입력받은 타입을 정수로 반환
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.println("a+b: " + (a+b));
        System.out.println("a-b: " + (a-b));
        System.out.println("a*b: " + (a*b));
        System.out.println("a/b: " + (a/b));
        System.out.println("a%b: " + (a%b));
    }
}
