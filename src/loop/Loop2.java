package loop;

public class Loop2 {
    public static void main(String[] args) {
        // 1부터 하나씩 증가하는 수를 더하기 1+2+3+4 ...
        int sum = 0;
        int i = 5;
        int end = 10;

        // 반복문 활용
        while (i <= end) {
            sum = sum +i;   // 0, 0+5, 5+6, ....
            System.out.println("sum= " + sum);
            // 반복문 안에서 출력을 하면 더하는 과정을 모두 볼 수 있음
            i++;
        }
        System.out.println("최종 결과 = " + sum);
        // 반복문 밖에서 출력하면 최종 결과만 출력해서 볼 수 있음
    }
    // 반복문을 사용하게 될 경우, 반복 횟수와 요구 조건을 유연하게 변경할 수 있다.
}
