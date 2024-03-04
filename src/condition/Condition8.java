package condition;

public class Condition8 {
    public static void main(String[] args) {
        // switch 문은 조건식에 해당하는 특정 값으로 실행할 코드를 선택한다.
        // 조건식 결과값이 case의 값과 일치하면 case의 코드 실행
        // break 문은 switch 문을 빠져나가게 하는 것이다.
        // break 문이 없으면 이후 case 문의 코드가 차례대로 실행된다.

        // 랜덤한 주사위 던지기
        int diceNumber = (int)(Math.random() * 6) + 1;
        // 난수 생성

        switch (diceNumber) {
            case 1 :
                System.out.println("1번이 나왔습니다. ");
                break;
            case 2 :
                System.out.println("2번이 나왔습니다. ");
                break;
            case 3:
                System.out.println("3번이 나왔습니다. ");
                break;
            case 4:
                System.out.println("4번이 나왔습니다. ");
                break;
            case 5:
                System.out.println("5번이 나왔습니다. ");
                break;
            default:
                System.out.println("6번이 나왔습니다. ");
                break;

        }
    }
}
