package class0.class2;

public class Student {
    // 필드
    String name;    // 이름
    int score;      // 성적
    int age;        // 연령

    // 생성자: 초기값을 할당하는 역할

    // 1. 기본 생성자
    Student() {
        System.out.println("기본 생성자 호출");
    }


    // 2. 생성과 함게 초기화를 시켜주는 생성자
    public Student(String name, int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    // 메서드
    // 초
}
