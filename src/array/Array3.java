package array;

public class Array3 {
    public static void main(String[] args) {
        int[] scores;       // 타입 [] 변수명;
        scores = new int [] {100,200,300,400,500};      // 한줄에 배열값 모두 입력 -> 중괄호 사용 (배열 초기화 5개 길이)
        // 배열에서는 new를 사용하여 초기화한다는 것 잊지 말기

        int [] scores2 = new int[] {13,26,55,77,80};    // 선언과 배열값 입력을 한번에 할 수 있음

        for (int i = 0; i < scores.length; i++) {       // 배열의 길이만큼 반복
            System.out.println(i + 1 + "번의 점수: " + scores[i]);
        }
        System.out.println(scores);     // [I@506e1b77
        // 배열에 직접 접근(위의 사례)하게 될 경우 참조값을 반환한다.
        // 배열의 내용(값)에 접근하고 싶을 때 배열[index]로 접근한다.    // []안에 인덱스값 입력
        // [i 정수형 배열 -> 해당 메모리번지에 참조됨
        System.out.println(scores[1]);
        /* 배열의 값을 읽는 순서
        1. 변수의 값을 읽는다. => 참조값
        2. 변수의 참조값을 통해 실제 배열에 접근
        3. 인텍스를 통해 해당 위치 내용에 접근하고 내용을 읽어옴
         */
    }
}
