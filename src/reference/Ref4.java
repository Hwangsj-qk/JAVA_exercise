package reference;

public class Ref4 {
    public static void main(String[] args) {
        // 1. 기본 타입
        int a = 10;
        int b = a;      // 기본 타입이므로 값(10)이 복사되어 대입

        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 10

        a = 20;     // a값을 변경
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10

        b = 100;
        System.out.println("======");
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 100

        // 기본 타입은 값을 복사하므로 바로 변경 가능

        System.out.println("==============");
        // 2. 참조 타입
        Data dataA = new Data();
        dataA.value1 = 100;
        Data dataB = dataA;
        //값(=data.value1 -> 참조값)이 복사되어 대입
        // -> 얕은 복사 (객체가 복사된 것이x, 주소가 복사된 것)

        System.out.println("DataA = " + dataA); // 참조값 0x10 (reference.Data@27973e9b)
        System.out.println("DataB = " + dataB); // 참조값 0x10 (reference.Data@27973e9b)
        // 참조된 주소를 복사해옴

        // A의 값이 변경
        dataA.value1 = 200;
        System.out.println("dataA.value1 = " + dataA.value1); //200
        System.out.println("dataB.value1 = " + dataB.value1); // 200
        // dataA = dataB라고 선언 -> dataB는 dataA의 참조값을 복사해옴 -> 값이 변경된 참조값을 그대로 출력


        // B의 값이 변경
        dataB.value1 = 300;
        System.out.println("dataA.value1 = " + dataA.value1); // 300
        System.out.println("dataB.value1 = " + dataB.value1); // 300
        // 두 개 중 하나만 변경되어도 둘 다 변경
        // dataA = dataB라고 선언 -> dataB는 dataA의 참조값을 복사해옴
        // -> 값이 변경된 참조값을 그대로 출력


    }

}
