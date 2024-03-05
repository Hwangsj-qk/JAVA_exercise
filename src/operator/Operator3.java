package operator;

public class Operator3 {
    public static void main(String[] args) {
        // 연산자 우선순위
        // 우선순위에 의해 곱셈을 먼저 계산 -> 우선순위 변경은 괄호를 통해서 할 수 있음
        
        int sum1 = 1 + 2 * 3;
        int sum2 = (1 + 2) * 3;
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        
        int sum3 = 2 * 2 + 3 + 3;
        int sum4 = (2 * 2) + (3 * 3);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        // 코드가 복잡해지는 것보다 길어지더라도 명확,단순하게 하는 것이 유지보수하기 좋다.
        // 연산자 우선순위가 애매하거나 복잡하다면 괄호 이용하기
    }
}
