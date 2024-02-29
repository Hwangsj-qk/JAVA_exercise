package variable.var;

public class Var1 {
    public static void main(String[] args) {
        // 변수 선언(Declare) : 타입명 변수 이름
        int age;    // 정수를 저장할 수 있는 age 이름의 변수 선언
        double value;   // 실수를 저장할 수 있는 value라는 이름의 변수 선언

        int x,y,z;      // 같은 종류의 변수는 한 번에 선언 가능

        /*
        변수 선언시 주의할 점
        - 변수 선언은 한 번만 가능하다.
        - 변수에는 타입이 맞는 값을 넣어야 한다 (타입과 맞지 않으면 컴파일러 에러 발생)
         */

        age = 18;   // 변수 초기화(initialize)
        int score = 90;     // 선언과 초기화를 동시에 할 수 있음

        int result = score + age;   // 다른 변수의 값을 불러들여 저장 또는 연산이 가능

    }
}
