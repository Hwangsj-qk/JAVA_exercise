package array;

import java.util.Scanner;

public class Ex5_2 {
    public static void main(String[] args) {
        // 2차원 배열을 활용한 점수 계산 문제
        // 3명의 학생, 과목은 국어, 영어, 수학
        // 의 점수를 입력 받아, 각 학생의 총점과 평균을 구하는 프로그램을 작성하세요.
        // +) 문자열 배열을 활용하여 해당 과목의 점수를 입력받기
        // +) 학생의 수를 입력받아서 n명 만큼의 총점과 평균을 구하기

        // 1. 학생 수 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int studentNumber = scanner.nextInt();

        // 2. 과목 배열 선언
        String[] subjects = {"국어", "영어", "수학"};

        // 3. 다차원 배열 선언
        int[][] scores = new int[studentNumber][subjects.length];
        // 행: 학생수, 열: 과목점수

        // 4. 점수 입력(향상된 for문 + 일반적인 for문)
        for (int[] students : scores) {
            System.out.println("학생의 성적을 입력하세요.");
            // 학생 수만큼 해당 문장이 반복
            for (int i = 0; i < subjects.length; i++) {
                System.out.println(subjects[i] + "점수: ");
                students[i] = scanner.nextInt();
                // 과목 수만큼 scanner가 반복
            }
        }

        // 5. 총점과 평균 구하기
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            System.out.println(i + 1 + "번 학생의 합계: " + sum);
            System.out.println(i + 1 + "번 학생의 평균: " + sum/scores[i].length);
        }
    }
}
