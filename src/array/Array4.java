package array;

public class Array4 {
    public static void main(String[] args) {
        // 다차원 배열
        int[][] matrix = new int [3][2];        // 기본배열은 1차원 배열인데 다차원으로 갈수록 []가 늘어남

        // 다차원 배열 초기화(값 입력)
        matrix[0][0] = 1;       // 0,0부터 차례대로 입력
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;
        matrix[2][0] = 5;
        matrix[2][1] = 6;       // 마지막: 2,1 -> 3행 2열의 배열

        // 0행 출력
        System.out.print(matrix[0][0] + " ");
        System.out.print(matrix[0][1] + " ");
        System.out.println();

        // 1행 출력
        System.out.print(matrix[1][0] + " ");
        System.out.print(matrix[1][1] + " ");
        System.out.println();

        // 2행 출력
        System.out.print(matrix[2][0] + " ");
        System.out.print(matrix[2][1] + " ");
        System.out.println();

        // for문 사용
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 2; column++) {
                System.out.print(matrix[row][column] + " ");

            }
            System.out.println();
            // row = 0 => column = 0,1을 돌고, row = 1 => column = 0,1이 돌면서 프린트하는 구조

        }
    }
}
