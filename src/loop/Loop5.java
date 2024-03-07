package loop;

public class Loop5 {
    public static void main(String[] args) {
        // continue 문
        // 반복문 속에서 continue 를 만나게 되면 다음 코드를 진행하지 않고 조건식으로 이동

        /*
        continue 문
        while (조건식) {
            code1;
            continue;  // code2를 실행하지 않고 즉시 조건식으로 이동한다.
            code2;
          }
         */

        int i = 1;

        while (i < 6) {
            if (i == 3) {
                i++;    // 3을 건너 뛰어도 더해줘야 다음 숫자로 넘어감.
                continue;   // i가 3일 때 continue를 만났기 때문에 건너뜀
            }
            System.out.println("i = " + i);
            i++;    // i가 3이 아닐 때는 i를 1씩 증가
        }

    }
}
