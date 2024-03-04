package condition;

public class Condition9 {
    public static void main(String[] args) {
        // break 문 없이 switch 문을 사용하게 될 경우
        // -> 해당 case 문 이후 모든 case 를 수행

        int time = 8;

        switch (time) {
            case 8:
                System.out.println("출근시간이다. ");
            case 9:
                System.out.println("입실시간이다. ");
            case 10:
                System.out.println("수업시간이다. ");
            case 13:
                System.out.println("점심시간이다. ");
            default:
                System.out.println("집에 가자~!");
                // default 는 모든 case 가 아닌 경우를 의미
                // 만약 time 이 8이라면 나머지 case 가 순차적으로 모두 실행
        }
    }
}
