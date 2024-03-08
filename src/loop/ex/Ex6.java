package loop.ex;

import java.util.Scanner;

public class Ex6 {
    // 피보나치 수열 찾기
    // 사용자로부터 정수 n을 입력받아,
    // 피보나치 수열의 첫 n 항을 출력하는 프로그램을 작성하세요.
    // 피보나치 수열에서 다음 항은 앞의 두 항의 합으로 구성됩니다
    // (예: 0, 1, 1, 2, 3, 5, 8, ...)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("피보나치 수열을 계산할 정수: ");
        int n = scanner.nextInt();
        int num1, num2;
        num1 = 0;
        num2 = 1;

        // 첫번째와 두번째 출력
        System.out.print("피보나치 수열: " +num1 + " " + num2);     // 0, 1

        for (int i = 3; i <=n ; i++) {      // 첫번째, 두번재 수열을 이미 출력
            int next = num1 + num2;
            System.out.print(" " + next);
            num1 = num2;
            num2 = next;
        }
    }
}
