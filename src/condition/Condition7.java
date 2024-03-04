package condition;

public class Condition7 {
    public static void main(String[] args) {
        // 주사위 던지기
        int diceNumber = (int)(Math.random() * 6) +1;
        // 1~6까지 랜덤한 난수 생성

        if (diceNumber == 1) {
            System.out.println("주사위 1번 입니다.");
        } else if (diceNumber == 2) {
            System.out.println("주사위 2번 입니다.");
        } else if (diceNumber == 3) {
            System.out.println("주사위 3번 입니다.");
        }else if(diceNumber == 4) {
            System.out.println("주사위 4번 입니다.");
        } else if (diceNumber == 5) {
            System.out.println("주사위 5번 입니다.");
        }else {
            System.out.println("주사위 6번 입니다.");
        }

        // if문을 사용하면 코딩이 길어져서 가독성이 떨어진다 -> switch문 활용
    }
}
