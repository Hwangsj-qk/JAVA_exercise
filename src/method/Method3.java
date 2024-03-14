package method;

public class Method3 {
    public static void main(String[] args) {
        boolean b1 = isOdd(3);
        boolean b2 = isOdd(4);

        System.out.println("b1 = " + b1);       // true
        System.out.println("b2 = " + b2);       // false

    }

    // 메서드 선언
    // 메서드: 홀수면 true, 짝수면 false를 반환(리턴)하는 메서드

    public  static boolean isOdd(int number) {
        if(number % 2 == 0) {
            return false;
        } else {
            return true;
        }
        // return을 만나면 그 즉시 메서드 종료
        // if 문이 메서드에 있을 경우 모든 경우에 따른 리턴값이 존재해야 한ㄷ. (Unless. 컴파일 에러 발생)
    }
}
