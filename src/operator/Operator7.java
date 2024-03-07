package operator;

public class Operator7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(a == b);     // false
        System.out.println(a != b);     // true
        System.out.println(a > b);      // false
        System.out.println(a >= b);     // false
        System.out.println(a <= b);     // true

        boolean result = a == b;
        System.out.println(result);     // false

        // 비교 연산자는 조건문과 함께 자주 사용된다.
    }
}
