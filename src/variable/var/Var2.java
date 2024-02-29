package variable.var;

public class Var2 {
    public static void main(String[] args) {
        System.out.println(100);
        System.out.println(100);
        System.out.println(100);
        System.out.println(100);
        // 만약 '100'이라는 값을 수정하려면 4번 다 고쳐야 한다.

        int number = 100;
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        // 이 경우 수정할 때 초기화 값만 수정하면 되어서 변수 선언하는 것이 수정에 용이하다.
    }
}
