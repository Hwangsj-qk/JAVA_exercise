package array;

public class Array6 {
    public static void main(String[] args) {
        // 다차원 배열 초기화
        int[][] matrix = new int[10][5];

        int i = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = i++;
            }
        }

        // 2차원 배열 출력: 향상된 for문 사용 (iter)
        for (int[] rows : matrix) {
            for (int element : rows) {
                System.out.print(element + " ");
            }
            System.out.println();

        }
    }
}
