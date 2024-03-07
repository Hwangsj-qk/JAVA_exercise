package loop.ex;

import java.util.Scanner;

public class Ex5 {
    // 짝수의 합 구하기
    // 사용자로부터 두 정수 start와 end를 입력받아,
    // start와 end 사이의 모든 짝수의 합을 계산하는 프로그램을 작성하세요

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("시작 숫자를 입력해주세요: ");
        int start = scanner.nextInt();
        System.out.print("끝 숫자를 입력해주세요: ");
        int end = scanner.nextInt();

        int sum = 0;

        for (int i = start; i <= end ; i++) {
            if(i % 2 == 0) {        // 짝수 구하는 공식
                System.out.print(i);
                sum += i;
                // 아래 if 문은 짝수 일 때만 실행되어야 하므로 바깥 if 문 안에 있어야 한다.
                if(i == end || i == end -1) {
                    System.out.print(" = ");
                } else {
                    System.out.print(" + ");
                }
            }

        }
        System.out.println(sum);
    }
}
