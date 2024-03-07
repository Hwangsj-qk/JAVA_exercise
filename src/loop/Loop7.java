package loop;

public class Loop7 {
    public static void main(String[] args) {
        // 1 ~ 10까지 합계를 구하는 for 문

        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
            System.out.println("sum = " + sum);
            // 반복문 안에서 출력을 하면 더하는 과정을 모두 볼 수 있다.
        }
        System.out.println("최종 결과: " + sum);
        // 반복문 밖에서 출력하면 최종 결과만 볼 수 있다.
    }
    // while문과 동일한 구조를 갖지만, 반복되는 코드에 집중할 수 있고 깔끔하게 볼 수 있다.


}
