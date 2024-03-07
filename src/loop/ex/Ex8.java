package loop.ex;

import java.util.Random;
import java.util.Scanner;

public class Ex8 {
    // 숫자 맞추기 게임
    // 1~100까지의 랜덤한 숫자가 있습니다.
    // 응답한 숫자가 낮으면 낮다, 높으면 높다고 대답하여 랜덤한 숫자를 추측합니다.
    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(100) + 1;

        // 정답 확인용
        System.out.println(answer);

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();

        int tryCount = 1;

        while (num < 10) {
            if(answer != num) {
                System.out.println("오답입니다.");
            }
        }
    }
}
