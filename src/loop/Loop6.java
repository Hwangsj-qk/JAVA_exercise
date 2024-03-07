package loop;

public class Loop6 {
    public static void main(String[] args) {
        // for 문
        /*
           for (1. 초기화식; 2. 조건식; 4. 증감식) {
                 3. 실행문(code)
        }
         */
        /*
        1. 초기화식이 가장 먼저 실행됨
        2. 조건식을 평가해서 true 일 경우 코드를 실행, false 일 경우 반복문 종료
        3. 코드를 모두 수행하고 증감식 실행 -> 증감된 변수가 조건식에서 다시 평가
        4. (2) 조건식 -> (3) 실행문 -> (4) 증감식을 반복 (조건식이 true인 동안)
         */

        // 1 ~ 10까지 출력하는 for 문
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        // for 문의 무한반복
        for( ; ;) {     // 조건이 없음 (while에서 조건이 true일 때와 동일)
            // 무한 반복할 코드
        }
    }
}
