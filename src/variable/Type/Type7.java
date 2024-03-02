package variable.Type;

public class Type7 {
    public static void main(String[] args) {
        // 문자열 => 기본타입으로 강제 변환(타입 변환)

        String s1 = "60000";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);
        
        double d1 = Double.parseDouble("3.14");     // 문자열 => 기본타입인 실수(double) 타입으로 변환
        System.out.println("d1 = " + d1);

        boolean f = Boolean.parseBoolean("false");  // 문자열 => 기본타입이 불리언 타입으로 변환
        System.out.println("f = " + f);
        
        // 기본 타입 => 강제 변환 (int, double, boolean 값을 문자열로 변환)
        String s = String.valueOf(100);     // 정수 타입(기본타입) => 문자열로 변환
        System.out.println("s = " + s);
        
        String s2 = String.valueOf(3.14);   // 실수 타입(기본타입) => 문자열로 변환
        System.out.println("s2 = " + s2);

        String s3 = String.valueOf(false);  // 불리언 타입(기본타입) => 문자열로 변환
        System.out.println("s3 = " + s3);
        
    }
}
