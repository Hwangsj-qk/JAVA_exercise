package variable.var;

public class Var3 {
    public static void main(String[] args) {
        // 변수의 사용(시간 표시하기)
        int hour = 5;
        int minute = 15;

        System.out.println(hour + "시 " + minute + "분"); // 5시 15분

        // 분단위를 변환해 반환
        int totalMinute = hour * 60 + minute;
        System.out.println("총 " + totalMinute + "분");
    }
}
