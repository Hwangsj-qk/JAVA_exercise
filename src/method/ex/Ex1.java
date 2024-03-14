package method.ex;

import java.util.Scanner;

public class Ex1 {
    // 두 수를 입력받아 뺄셈을 하는 메서드를 만들어주세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수 입력: ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 정수 입력: ");
        int num2 = scanner.nextInt();

        substract(num1,num2);

    }

    // 메서드 선언
    public static int substract(int num1, int num2) {
        System.out.println("두 수의 뺄셈 결과: " + (num1 - num2));
        return num1 - num2;
        // ※ 이 문제에선 리턴 타입을 void로 변경해도 문제 없음
        // 그럼 언제 return을 사용할까? => 뺄셈한 값을 받아서 메인 클래스에서 '활용'을 하고 싶을 때
    }
}
