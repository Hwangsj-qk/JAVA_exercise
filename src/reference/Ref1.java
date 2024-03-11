package reference;

public class Ref1 {
    public static void main(String[] args) {    // 메소드 영역(main 메소드) -> 스택 영역
        // int: 기본타입 (앞에 소문자인 타입)
        int int1 = 10;      // 변수 선언, 초기화 -> 스택 영역: 10 (4바이트 안에 따로 생성 없이 저장)
        int int2 = 10;

        // 문자열 (앞에 대문자인 타입) -> 참조타입: 힙 영역 0 X 100 : "홍길동" <- 문자열 리터럴
        String str1 = "홍길동";    // 변수 선언, 초기화 -> 스택 영역: 0X100 (문자열 리터럴에 저장)
        String str2 = "홍길동";    // 변수 선언, 문자열 리터럴 참조: 0X100

        if(str1 == str2) {
            System.out.println("str1과 str2는 값이 같음");    //  결과: 값이 같음
        } else {
            System.out.println("str1과 str2는 값이 다름");
        }

        // new 연산자: '객체를 생성'하는 연산자
        // 힙 영역: 0X200 -> '홍길동' 입력 -> 0X300 -> '홍길동' 입력
        String str3 = new String("홍길동");    // 변수 선언, 초기화 -> 스택 영역 0X200
        String str4 = new String("홍길동");    // 스택 영역 0X300에 저장

        // ==, != 연산: 변수의 값이 같은지 아닌지를 비교
        // 참조 타입의 경우 동일한 객체를 참조하는지 아닌지를 비교 -> 0x200과 0x300을 비교하는 것임

        if (str3 == str4) { //문자 연산자는 equal로 비교하는 게 더 좋음
            System.out.println("str3과 str4는 참조가 같음");
        } else {
            System.out.println("str3과 str4는 참조가 다름");    // 결과: 다름 (0X200 / 0X300을 비교)
        }

        //문자열 내부값을 비교할 때는 equals 사용
        if (str3.equals(str4)) {
            System.out.println("str3과 str4는 문자열이 같음");    // 결과: 같음 (참조값이 아닌 내부값을 비교하기 때문)
        } else {
            System.out.println("str3과 str4는 문자열이 다름");
        }

    }
}
