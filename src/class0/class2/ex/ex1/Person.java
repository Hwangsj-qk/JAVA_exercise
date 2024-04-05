package class0.class2.ex.ex1;

public class Person {
    // 필드
    String name;
    int age;
    String gender;

    // 생성자
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, String gender) {
        this(name,0,gender);
    }

    // 메서드
    void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age + ", 성별: " + gender);
    }
}
