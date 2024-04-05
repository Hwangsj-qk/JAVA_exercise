package class0.class2.ex.ex3;

public class Book {
    // 필드
    String title;
    String author;
    String isbn;
    boolean isAvailable;

    // 생성자
    public Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // 메서드
    void borrowBook() {
        // 대여 진행
        if (isAvailable == true) {       // 빌릴 수 있음
            isAvailable = false;
            System.out.println("도서를 대여하였습니다. ");
        } else {       // 이미 대여중인 상태
            System.out.println("도서를 대여할 수 없습니다. 대여중입니다.");
        }
    }
    void returnBook() {
        isAvailable = true;
        System.out.println("도서를 반납하였습니다.");
    }
    void  printInfo() {
        System.out.println("책 : " + title + "저자 : " +  author + "ISBN : " + isbn  + "대여가능여부 : " + isAvailable );
    }
}