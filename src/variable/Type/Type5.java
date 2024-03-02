package variable.Type;

public class Type5 {
    public static void main(String[] args) {
        byte v1 =  10;
        byte v2 = 100;
        long v3 = 1000L;

        // 정수 연산 시 가장 큰 타입에 넣으면 자동 변환(Promotion)이 된다.
        long result = v1 + v2 + v3; // 자동 변환 (promotion)

//        int result2 = v1 + v2 + v3;   => 작은 타입에 담을 시 컴파일러 에러 발생

        // 강제 변환(Casting)
        int result2 = (int) (v1 + v2 + v3);     // 캐스팅을 통한 강제 변환

        int v4 = 10/4;
        System.out.println("v4 = " + v4);
        // int / double = double로 계산, int / int = int로 계산 (큰 타입이 있으면 자동으로 큰 타입으로 자동 변환)

        /*
        계산 결과: 2    => 둘 다 정수 int 타입이기 때문에 int/int 계산 결과여 0.5는 버려짐
         */
        
        double v5 = 10/4;
        System.out.println("v5 = " + v5);
        /*
        계산 결과: 2.0      => int/int이기 때문에 소수점은 버려졌으나, double 타입으로 계산 결과를 반환하기 때문에 2.0 반환
         */
        
        double v6 = 10.0 / 4;
        System.out.println("v6 = " + v6);
        /*
        계산 결과: 2.5      => 두 숫자 중 하나라도 double 타입이면 int와 double 중 더 큰 타입인 double로 계산 결과가 나오고,
                              반환도 double 이므로 double 타입으로 결과가 나옴
         */

    }
}
