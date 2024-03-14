package reference;

public class Ref3 {
    public static void main(String[] args) {
        Data data1 = new Data();
        // 객체를 생성하여 참조값을 data1에 저장 (ex. data1 = 0X10)
        data1.value1 = 10;
        Data data2 = data1;
        // 객체의 위치를 가리키는 '참조값'을 복사한다. (data2 = 0x10)

        int a = 10, b= 20;
        int sum = a + b;
        // 기본 타입은 연산이 가능

        // int dataSum = data1 + data2;
        // 참조타입은 기본적으로 연산이 불가
        int dataSum = data1.value1 + data1.value2;
        // 참조 타입의 '기본 타입 필드'에 접근하면 연산 가능

        // String 문자열은 특별한 타입으로 문자열 연결 연산 가능
    }
}
