package operator;

public class Operator8 {
    public static void main(String[] args) {
        // 문자열 비교: equals()
        String s1 = "안녕";
        String s2 = "안녕하세요";
        String s3 = "안녕";

        boolean r1 = s1 == s2;
        System.out.println("r1 = " + r1);   // false
        
        boolean r2 = s1 == s3;
        System.out.println("r2 = " + r2);   // true

        // 문자열을 비교할 때 비교 연산자를 사용하면 맞지 않을 확률이 높음.

        // equals() : 문자열 일치 비교
        boolean r3 = "안녕".equals("안녕");
        System.out.println("r3 = " + r3);       // true

        boolean r4 = "안녕".equals(s2);
        System.out.println("r4 = " + r4);       // false

        // 문자열 바로 뒤에 "." 찍고 메서드 사용 가능


    }
}
