package reference;

public class Null1 {
    public static void main(String[] args) {
        Data data = null;   // 에러
//        Data data1 = new Data();  // 작동

        data.value1 = 100;
        // Data에 value1이라는 필드가 존재함에도 지금 data가 null값이라 에러
        // 에러: Cannot assign field "value1" because "data" is null
        // null.value1 = 100; <- 참조할 주소가 존재하지 않는다.
        System.out.println(data.value1);
        // NullPointException 이 발생하여 프로그램이 종료된다.
    }
}
