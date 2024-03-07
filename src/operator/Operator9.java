package operator;

public class Operator9 {
    public static void main(String[] args) {
        // 논리 연산자
        // boolean 형인 true 와 false 를 비교하는데 사용됨

        System.out.println("And 연산");
        System.out.println(true && true);       // true
        System.out.println(true && false);      // false
        System.out.println(false && true);      // false
        System.out.println(false && false);     // false

        System.out.println("or 연산");
        System.out.println(true || true); //true
        System.out.println(true || false ); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false

        System.out.println("부정 연산");
        System.out.println(!true); //false
        System.out.println(!false) ; //true


    }
}
