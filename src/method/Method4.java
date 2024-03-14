package method;

public class Method4 {
    public static void main(String[] args) {
        checkAge(15);
        // 미성년자입니다. 주류 및 담배 판매가 불가합니다.

        checkAge(22);
        // 성인입니다. 주류 및 담배 판매가 가능합니다.
    }

    // 메서드 선언
    // 나이에 따라 다른 문구가 출력되는 메서드
    public static void checkAge(int age) {
        if(age < 18) {
            System.out.println("미성년자입니다. 주류 및 담배 판매가 불가합니다." );
        } else {
            System.out.println("성인입니다. 주류 및 담배 판매가 가능합니다. ");
        }
    }
}
