package array;

import java.util.Scanner;

public class Ex5 {
    // 2차원 배열을 활용한 점수 계산 문제
    // 3명의 학생, 과목은 국어, 영어, 수학
    // 의 점수를 입력 받아, 각 학생의 총점과 평균을 구하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. 다차원 배열 선언
        int [][] scores = new int[3][3];
        // 3명의 학생 수(행), 3개의 과목(열) -> 3행 3열의 다차원 배열

        // 2. 점수 입력 (향상된 for문 활용)
        for (int[] students : scores) {
            System.out.println("학생의 성적을 입력하세요");
            for (int i = 0; i < students.length; i++) {
                students[i] = scanner.nextInt();
            }

        }

        // 3. 총점과 평균 구하기
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            // 각 학생 당 총점이 나와야하기 때문에 중첩 전 적기 (변수 선언의 경우 반목문 안에서 하는 경우가 잘 없음)
            // 인덱스 값이 필요하므로 향상된 for문보다는 일반적인 for문을 사용
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
                // scores i행 학생의 각 과목의 점수를 받은 j를 서로 합한다.
            }
            System.out.println(i+1 + "번 학생의 합계: " + sum);
            System.out.println(i+1 + "번 학생의 평균: " + sum/scores[i].length);

        }
    }
}
