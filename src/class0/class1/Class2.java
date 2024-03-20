package class0.class1;

public class Class2 {
    public static void main(String[] args) {
        String student1Name = "홍길동";
        int student1Score = 80;
        int student1Age = 30;

        String student2Name = "임꺽정";
        int student2Score = 70;
        int student2Age = 40;

        String student3Name = "이몽룡";
        int student3Score = 90;
        int student3Age = 20;

        // 학생정보 출력
        System.out.println("[ 학생 이름 : " +student1Name + ", 점수 : " + student1Score + " 나이 : " + student1Age + " ]");
        System.out.println("[ 학생 이름 : " +student2Name + ", 점수 : " + student2Score + " 나이 : " + student2Age + " ]");
        System.out.println("[ 학생 이름 : " +student3Name + ", 점수 : " + student3Score + " 나이 : " + student3Age + " ]");
        // 코드가 길어지고 복잡해짐 -> 클래스를 통해 작성하면 코드가 간결해진다.
    }
}
