package method.ex;

public class Ex3 {
    // 정수 배열의 평균 구하기
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15};
        System.out.println(calculateAverage(numbers));
    }
    public static double calculateAverage(int [] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
