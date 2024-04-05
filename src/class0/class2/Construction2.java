package class0.class2;

public class Construction2 {
    public static void main(String[] args) {
        Member member1 = new Member("홍길동", 80,30);
        Member member2 = new Member("이순신", 100, 35);
        Member member3 = new Member("임꺽정", 40);
        // 생성자가 존재할 때, 입력값이 없는 생성자를 호출하면 컴파일 오류 발생 -> 런타임 오류 원천 차단(제약)

        // member 타입의 배열 생성
        Member[] members = {member1, member2, member3};

        // 배열 출력
        for (Member member : members) {
            System.out.println("이름 : " + member.name + ", 성적 : " + member.score + ", 나이 : " + member.age);
        }

    }

}
