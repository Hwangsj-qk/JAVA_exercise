package method;

public class Method6 {
    public static void main(String[] args) {
        int number = 10;
        double number2 = 10.5;
        printNum(number);
        // printNum(number2);  => 타입이 맞지 않으므로 에러 발생
        printNum((int) number2);    // => 활용하기 위해선 다운 캐스팅 필요(대신 소수점이 버려짐)

        printDouble(number2);
        printDouble(number);    // => 타입이 다르지만 자동 프로모션으로 활용 가능

    }
    public static void printNum(int number) {
        // 'int 타입'을 매개변수로 받는 메서드
        // ※ 리턴 타입이 'void'이므로 return이 필요 X
        System.out.println("숫자는 " + number);
    }
    public static void printDouble(double number) {
        // 'double 타입'을 매개변수로 받는 메서드
        System.out.println("숫자는 " + number);
    }
}
