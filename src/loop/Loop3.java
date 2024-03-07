package loop;

public class Loop3 {
    public static void main(String[] args) {
        // do - while 문
        // while문과 유사하지만, 무조건 '한 번은' 코드를 실행한다.
        /*
        do {
             반복할 코드
        } while (조건식);
         */

        int i = 10;

        do {
            System.out.println("i = " + i);
            i++;
        }while (i < 5);
        // 결과: i = 10
        // 조건이 false 라고 해도 무조건 한 번은 실행해서 값이 나오게 된다.

        System.out.println("==========");
        while (i < 5) {
            System.out.println("i = " + i);
            i ++;
        }
        // 결과: 없음
        // 일반 while 문의 경우 처음부터 false 조건을 만나면 아무 것도 출력하지 않는다.

    }
}
