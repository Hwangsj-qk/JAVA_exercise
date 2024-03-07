package loop.ex;

public class Ex1 {
    // 반복문을 이용해서 20이내의 짝수를 출력해주세요
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            if(i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }
    }
}
