package loop;

public class Loop4 {
    public static void main(String[] args) {
        // break 문
        // 반복문에서 반복 실행을 할 때 break 를 만나게 되면 반복문이 종료된다.

        int sum = 0;
        int i = 1;

        while (true) {   // 조건이 true 이므로 무한 반복
        sum = sum + i;

            if (i > 10) {
                System.out.println("sum = " + sum);
                break;
                // i가 10을 초과하면 반복문에서는 true이지만 break문으로 인해 반복문 종료
            }
            i++;
            // if 문에서 조건과 부합하면 증가하고 아니면 break
        }
    }
}
