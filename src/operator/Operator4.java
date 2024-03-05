package operator;

public class Operator4 {
    public static void main(String[] args) {
        // 증감 연산자
        int x = 0;
        
        x = 0 + 1;  // 0 + 1 = 1
        System.out.println("x = " + x);
        x = x + 1;   // 1 + 1 = 2
        System.out.println("x = " + x);
        
        ++x; // x = x + 1
        System.out.println("x = " + x);     // 결과: 3
        x++;
        System.out.println("x = " + x);     // 결과: 4
        --x;
        System.out.println("x = " + x);     // 결과: 3
        x--;
        System.out.println("x = " + x);     // 결과: 2
        
    }
    

}
