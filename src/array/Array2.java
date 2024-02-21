package array;

public class Array2 {
    public static void main(String[] args) {


        // 배열: 같은 타입의 변수를 '반복적으로 선언'할 때
        // 동일한 타입을 연속된 '메모리 공간'에 저장하는 자료 구조

        int[] scores;      // int 타입의 배열 변수를 선언
        scores = new int[6];    // 배열 생성: 6개 만큼의 길이 배열

        // 배열의 값을 초기화(값 입력)
        scores[0] = 100;        // 0번지부터 시작
        scores[1] = 90;
        scores[2] = 80;
        scores[3] = 70;
        scores[4] = 60;
//        scores[5] = 50;       // 배열을 초기화하지 않으면 자동으로 초기값으로 초기화된다. (0)
//        scores[6] = 40;       // 배열의 범위를 초과하는 인덱스에 접근할 경우 예외 발생(컴파일 에러)
        // 기본타입의 초기값: 숫자 - 0, 실수 - 0.0, boolean - false
        // 참조타입의 초기값: null

        for (int i = 0; i < scores.length; i++) {       // 배열의 길이만큼 반복
            System.out.println(i + 1 + "번의 점수: " + scores[i]);
        // 배열을 사요하면 반복문으로 리팩토링 가능
        }

        // 배열 + 반복문으로 많이 활용됨

    }
}
