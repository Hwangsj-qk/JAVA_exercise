package method.ex;

public class Ex4 {
    /*
    배열에서 최소값과 최대값 찾기
    배열 내의 최소값과 최대값을 찾아 출력하는 메소드 findMinAndMax를 작성하세요.
     */

    public static void main(String[] args) {
        int [] numbers = {54, 32, 21, 6, 24, 3, 100, -5};
        findMinAndMax(numbers);
    }

    public static void findMinAndMax(int[] numbers){
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(min > numbers[i]) {
                min = numbers[i];
            }
            if(max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("최솟값: " + min + ", 최댓값: " + max);
    }
}
