package array;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        // 5개의 정수를 입력받아서, 배열에 저장하고, 입력 순서대로 출력해보세요.
        /* 예시
        정수를 5개 입력하세요.
        1
        2
        3
        4
        5
        >> 1, 2, 3, 4, 5
         */
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.print("정수를 입력하세요");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length-1) {
                System.out.print(nums[i] + ",");
            } else {
                System.out.print(nums[i]);
            }
        }



    }
}
