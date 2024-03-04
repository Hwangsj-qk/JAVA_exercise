package condition;

public class Condition6 {
    public static void main(String[] args) {
        //가격이 10000원 이상일 때, 1000원 할인
        // 나이가 10살 이하일 때 1000원 할인

        int price = 150000;
        int age = 8;
        int dc = 0;

        if(price >= 10000){
            dc = dc+1000;   // => dc += 1000;
            System.out.println("만원 이상 구매로 1000원 할인 되었습니다. ");
        }
        // 나이대에 대한 할인의 경우 따로 정의해야함

        if (age <= 10) {
            dc = dc + 1000;
            System.out.println("10살 이하 고객으로 1000원 할인 되었습니다. ");
        }
        System.out.println("모두 " + dc + "원 할인되었습니다. ");

        // 각각의 조건이 독립 조건일 땐 if문을 개별적으로 사용
        // -> ex) 할인 적용 요건이 나이와 구매 금액의 두가지 독립 조건이므로 개별적으로 if문을 사용해야함
        // 만약 연관된 조건이었다면 esle-if문 활용하는 것이 더 효율적
    }
}
