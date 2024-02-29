package variable.var;

public class Var4 {
    public static void main(String[] args) {
        // 두 변수의 값 교환하기
        /*
        두 그릇의 내용물을 바꾸는 순서:
        A그릇: 10ml 물
        B그릇: 20ml 오렌지 주스가 있다.
        어떻게 하면 내용물을 바꿀 수 있을가?
         */
        int a = 10;
        int b = 20;
        int temp;

        temp = a;   // 빈그릇에 A그릇의 값을 넣는다.
        a = b;      // B그릇의 값을 A그릇으로 옮긴다.
        b = temp;   // 임시그릇의 값을 B그릇으로 옮긴다.
        System.out.println("바뀐 후: A그릇 - " + a + " / B그릇: " + b);
    }
}
