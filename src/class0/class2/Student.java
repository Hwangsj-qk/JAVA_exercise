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
    // 초기화 메서드
    void initStudnet(String nameParameter, int score, int age) {
        // 필드와 매개변수의 이름이 같아서 데이터가 입력되지 않을 때

        // 1. 필드와 매개변수의 이름을 다르게 설정
        name = nameParameter;

        // 2. this 키워드 활용
        this.score = score;
        this.age = age;

        // 객체의 필드 값(age)에 매개변수(age)를 대입하겠다.
        // this 는 객체 자신을 참조하는 참조 변수
    }
}
