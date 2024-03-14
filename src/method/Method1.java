package method;

public class Method1 {
    public static void main(String[] args) {
        System.out.println("===== 메소드 사용 전 =====");
        int x = 15;
        int y = 40;
        int sum = x + y;
        System.out.println("덧셈 결과: " + sum);

        System.out.println("===== 메소드 사용 후 =====");
        int number = sum(15, 40);
        // 메소드를 활용하면 4줄 -> 1줄로 줄일 수 있다.

    }

    public static int sum(int x, int y) {
        int sum = x + y;
        System.out.println("덧셈결과: " + sum);
        return sum;
    }
}
