package method;

public class Method2 {
    public static void main(String[] args) {
        header();
        // 메서드 호출
        System.out.println("자바 프로그램이 실행되고 있습니다. ");
        System.out.println("각종 연산을 수행합니다...");
        footer();

    }
    
    // 메서드 선언
    public static void header() {
        System.out.println("===== 자바 프로그램이 시작되었습니다 =====");

        // void는 return 없이 종료 가능
    }

    public  static String footer() {
        String str = "===== 자바 프로그램이 종료되었습니다 =====";
        System.out.println(str);

        return str;
        // System.out.println("안녕하세요"); -> return 이후의 코드는 닿지 않는다 (에러 발생)
    }

}
