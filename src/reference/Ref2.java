package reference;

public class Ref2 {
    public static void main(String[] args) {
        /*
        null: 참조 타입의 변수가 객체를 참조하지 않는다는 것을 나타내는 값
        -> 값이 비어있다. 0과는 다른 개념
        null 값을 가진 참조 타입 변수
        - 변수가 초기화되지 않았을 때
        - 객체가 명시적으로 null 값으로 설정되었을 때
        - 객체가 메모리에서 삭제되었을 때
         */
        String str;     // 변수 선언, 초기화 X => null
        String str2 = null;     // 객체가 명시적으로 null 값으로 설정

        // NullPointerException (NPE)
        // - 참조 타입 변수가 null값을 가지고 있는데,
        // 메서드나 필드에 접근하려고 할 때 발생하는 예외
        str2.length();
        // 컴파일 단계에서는 확인 불가. 실행하면 에러 발생
        // str2가 null값을 가지기 때문

        // NPE 예방법
        if (str2 != null) {     // 애초에 null값이면 작동하지 않도록 조건문 설정
            str2.length();
        }
    }
}
