package array;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 배열에서 최대값과 최소값을 구하기
        // 정수를 n개 입력받아 배열에 저장하고,
        // 그 중 가장 큰 수와 가장 작은 수를 구하는
        // 프로그램을 작성해보세요.
        /* 예시
        입력받을 숫자 : 4
        4개의 정수를 입력하세요
        76
        5
        23
        9
        최대값 : 76, 최소값 : 5
         */

        Scanner scanner = new Scanner(System.in);

        // 1. 입력받을 숫자의 개수 입력받기
        System.out.println("입력받을 숫자: ");
        int n = scanner.nextInt();

        // 2. 배열 선언
        int[] nums = new int[n];

        // 3. 최소값, 최대값 변수명 선언
        int min, max;

        // 4. 배열 입력
        System.out.println(n + "개의 정수를 입력하세요");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            // 인덱스(i) 안에 정수 입력받기
        }

        // 5. 최소값, 최대값 찾기
        min = nums[0];
        max = nums[0];
        // 최소값, 최대값을 배열의 제일 첫번째 값으로 설정

        for (int num : nums) {
            // num은 배열 nums의 '구성요소'를 순회해야 하기 때문에 향상된 for문 사용
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        System.out.println("최소값: " + min);
        System.out.println("최소값: " + max);
    }
}
