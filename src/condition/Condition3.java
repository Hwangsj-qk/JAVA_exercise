package condition;

public class Condition3 {
    public static void main(String[] args) {
        // 여러 개의 if문 활용하기

        int age = 18;

        if(age >= 8 && age <= 13) {
            System.out.println("중학생입니다. ");
        }
        if(age >= 14 && age <= 19) {
            System.out.println("고등학생입니다. ");
        }
        if(age >= 20) {
            System.out.println("성인입니다.");
        }
        // 연결된 조건임에도 불구하고 if문만 사용할 경우 코드의 가독성이 떨어짐
    }
}
