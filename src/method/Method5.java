package method;

public class Method5 {
    public static void main(String[] args) {
        // 자바에서 메서드는 변수의 값을 복사해서 대입한다.
        int number = 3;
        System.out.println("메소드 호출 전: " + number);      // 3
        multiply2(number);
        System.out.println("메소드 호출 후: " + number);      // 3
    }
    // 메서드 선언
    // 메서드: 정수를 매개변수로 받아 두배로 곱하는 메서드
    public static void multiply2(int number) {
        // ※ 메인 메서드의 number와 multiply2 메소드의 number은 다른 값이다.
        // 메인 메서드의 number를 복사한 값이다.
        System.out.println("메소드 실행 전: " + number);      // 6

        number = number * 2;
        // 다른 메서드에서 변경된 number의 값은 메인 메소드의 number에 영향을 주지 않는다.
        System.out.println("메소드 실행 후: " + number);      // 3
    }
}
