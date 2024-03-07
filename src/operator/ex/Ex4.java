package operator.ex;

public class Ex4 {
    public static void main(String[] args) {
        // 사다리꼴의 넓이를 구하는 코드를 만드세요.
        int longTop = 5;
        int longBottom = 10;
        int height = 7;

        double area = (double) (longTop + longBottom) * (double) height /(double) 2;
        System.out.println("area = " + area);

    }
}
