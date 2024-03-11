package reference;

public class Null2 {
    public static void main(String[] args) {
        DataWraaper dataWraaper = new DataWraaper();
        dataWraaper.data = new Data();
        // 인스턴스 내부의 참조 필드를 초기화 생성
        // -> 초기화를 생성하면 주소가 떠서 런타임 에러가 뜨지는 않음 (null -> 0x400)

        // 초기화 하지 않은 필드에 접근 시 초기값이 대입된다.
        System.out.println(dataWraaper.count);
        // int 타입의 경우 초기값: 0
        System.out.println(dataWraaper.data);
        // 초기화 X ->초기값 입력(참조타입의 초기값: null) -> reference.Data@4e50df2e
        // dataWraaper.data = new Data() -> 데이터 타입의 새로운 객체만 생성.
        // 참조 타입이므로 이 객체 주소만 출력

        // 컴파일러에서 작동하지 않지만, 런타임 단계에서 NPE가 발생
        System.out.println(dataWraaper.data.value1);
        // 에러:Cannot read field "value1" because "dataWrapper.data" is null
        // = System.out.println(null.value1



    }
}
