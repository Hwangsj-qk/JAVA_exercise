package class0.class2.ex.ex3;

public class Ex3 {
    public static void main(String[] args) {
        // 객체 생성
        Book book1 = new Book("노인과 바다", "어니스트 헤밍웨이", "12345678", true);
        Book book2 = new Book("혼자공부하는자바", "홍길동");

        // 메서드 호출
        book1.printInfo();
        book1.borrowBook();
        book1.printInfo();
        book1.borrowBook();
        book1.returnBook();
        book1.printInfo();

    }
}
