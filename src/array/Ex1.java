package array;

public class Ex1 {
    public static void main(String[] args) {
        // 학생들 점수가 10, 20, 30, 40, 50 점
        // 배열을 선언하고, 모든 학생의 합계점수와 평균점수를 구해보세요

        int [] scores = {10,20,30,40,50};

        int sum = 0;    // 선언의 경우 반복문 안에 넣으면 계속적으로 선언이 되기 때문에 오류
        // 선언은 클래스에서 한 번만 이루어져야 함.

        // 향상된 for문
        for (int sco : scores) {
            sum = sum + sco;
        }
        System.out.println("합계: " + sum);
        System.out.println("평균: " + sum/scores.length);

        // 기존의 for문
        for (int i = 0; i < scores.length; i++) {
            sum = sum+scores[i];
        }
        System.out.println("합계점수: " + sum);
        System.out.println("평균점수: " + sum/scores.length);

    }


}
