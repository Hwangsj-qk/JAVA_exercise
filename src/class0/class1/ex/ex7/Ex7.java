package class0.class1.ex.ex7;

public class Ex7 {
    // 사각형의 넓이와 둘레, 정사각형 여부를 구하는 절차적 코드입니다.
    // => 사각형 클래스를 만들어 객체지향적 코드로 변경해주세요.
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 10;

        // 넓이 구하기
        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);

        // 둘레 구하기
        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레: " + perimeter);

        // 정사각형 여부 확인
        boolean square = rectangle.isSquare();
        if(square == true) {
            System.out.println("정사각형입니다. ");
        } else {
            System.out.println("정사각형이 아닙니다. ");
        }
    }
}
