package variable.read;

import java.util.Scanner;

public class Read2 {
    public static void main(String[] args) {
        // 키보드에 입력된 내용을 문자열로 얻기
        Scanner scanner = new Scanner(System.in);
        System.out.print("글자 입력: ");
        String line = scanner.nextLine();

        System.out.println(line);
    }
}
