package array;

public class Ex4 {
    public static void main(String[] args) {
        // 2차원 배열의 합계 구하기
        // 2차원 정수 배열을 선언하고 모든 요소의 합계를 계산하는 프로그램을 만드세요.

        // 1. 2차원 배열 선언하기
        int [][] numbers = {
                {1,2,3,4},
                {5,6,7,8}
        };

        // 2. 향상된 for문으로 2차원 배열의 합계 출력하기
        int sum = 0;

        for (int[] number : numbers) {
            // 배열 number은 배열 numbers의 안 '구성요소'를 순회
            for (int i : number) {
                // i는 배열 number 안 '구성요소'를 순회
                sum += i;
            }
        }
        System.out.println("합계: " + sum);
  }
}
