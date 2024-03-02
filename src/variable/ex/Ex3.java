package variable.ex;

public class Ex3 {
    public static void main(String[] args) {
        // 100억을 담는 변수를 선언하세요(타입 설정)
        // 그 변수를 출력해보세요
        // boolean 타입의 변수를 선언하고 출력해보세요.

        long num = 10_000_000_000L;
        // 10억이 넘는 경우 long 사용 (자바에서는 쉼표 대신에 _사용)
        System.out.println(num);
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 + " / " + b2);
    }
}
