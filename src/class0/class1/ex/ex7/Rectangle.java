package class0.class1.ex.ex7;

public class Rectangle {
    // 필드: 데이터
    int width = 5;
    int height = 8;
    // 메인에서 필드값 변경 가능

    // 메서드 : 기능
    // 1. 넓이를 계산하는 메서드
    int calculateArea() {
        return width * height;
    }

    // 2. 둘레를 계산하기는 메서드
    int calculatePerimeter() {
        return 2 * (width + height);
    }

    // 3. 정사각형 여부를 리턴하는 메서드
    boolean isSquare() {
        return width == height;
    }
}
