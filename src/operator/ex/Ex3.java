package operator.ex;

public class Ex3 {
    public static void main(String[] args) {
        //34자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어줄 때,
        // 1인당 몇 개를 가질 수 있고, 몇 개가 남는지를 구하는 코드입니다.

        int pencils = 34;
        int students = 30;

        int pencilPerStudents = 34 / 30;
        System.out.println("pencilPerStudents = " + pencilPerStudents);

        int pencilLeft = 34 % 30;
        System.out.println("pencilLeft = " + pencilLeft);
    }
}
