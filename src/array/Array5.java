package array;

public class Array5 {
    public static void main(String[] args) {
        // 다차원 배열 초기화(값 입력)
        int[][] matrix = {
                {1,2},
                {3,4},
                {5,6}
        };      // 3행 2열의 배열구조 안에 바로 값을 입력

        // 2차원 배열 출력
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 2; column++) {
                System.out.print(matrix[row][column] + " ");

            }
            System.out.println();

        }
    }

}
