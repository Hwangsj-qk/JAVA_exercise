package condition;

public class Condition4 {
    public static void main(String[] args) {
        // if - else if 문 활용

        int age = 22;

        if(age <= 7) {
            System.out.println("미취학 아동입니다. ");
        } else if (age <= 13) {
            System.out.println("초등학생입니다. ");    // 첫번째 if문에서 7세 이하를 분류
        } else if (age <= 16) {
            System.out.println("중학생입니다. ");
        } else if (age <= 19) {
            System.out.println("고등학생입니다,");
        } else {
            System.out.println("성인입니다.");   // else-if문에서 분류되지 않은 모든 나이대를 else로 묶음
        }
    }
}
