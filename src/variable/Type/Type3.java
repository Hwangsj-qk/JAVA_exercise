package variable.Type;

public class Type3 {
    public static void main(String[] args) {
        // 자동 타입 변환: 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 저장될 때: Promotion
        // byte > short > int > long > float > double
        // 정수 타입이 실수 타입으로 저장될 경우 무조건 자동 타입 변환
        
        byte b = 10;
        int i = b;
        // 이때 자동으로 타입이 int  -> byte로 전환
        long l = i;
        // long -> byte로 전환
        
        float f = l;
        double d = f;

        System.out.println("b= " + b);
        System.out.println("i = " + i);
    }
}
