package class0.class2;

public class Construction1 {
    public static void main(String[] args) {
        Student student1 = new Student();        // 객체 생성

        // 객체의 필드값을 초기화
        student1.name = "홍길동";
        student1.score = 70;
        student1.age = 30;

        // 생성 및 초기값 입력이 반복
        Student student2 = new Student();
        student2.name = "임꺽정";
        student2.score = 70;
        student2.age = 40;

        // 객체 초기화 메서드를 통해 생성
        Student student3 = new Student();
        student3.initStudnet("이순신", 100, 35);

        // 생성자를 통해 객체 생성 및 초기화
        Student student4 = new Student("전우치", 95, 25);

        // 초기화 메서드를 통해 생성
        Student student5 = new Student();
        initStudent(student5, "이몽룡", 90, 20);

        // Student 배열를 만들어 필드 값을 출력
        Student[] students = {student1, student2, student3, student4, student5};
        for (Student student : students) {
            System.out.println("이름: " + student.name + ", 성적: " + student.score + ", 나이: " + student.age);
        }
    }
    static  void  initStudent (Student student, String name, int score, int age) {
        student.name = name;
        student.score = score;
        student.age = age;
    }
}
