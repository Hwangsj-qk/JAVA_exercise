package method.ex;

import java.util.Scanner;

public class Ex7_hangMan {
    public static void main(String[] args) {
        // 단어 목록에서 무작위로 선택될 단어들
        String[] words = {"java", "computer", "program", "kotlin", "game"};

        // 선택된 단어(랜덤을 돌려서 나온 숫자를 인덱스로 설정)
        String selectedWord = words[(int) (Math.random() * words.length)];

        // 플레이어에게 보여줄 단어의 형태 ('_'로 가려진 형태)
        char[] displayArray = new char[selectedWord.length()];
        // 캐릭터 타입의 단어 길이 만큼의 새로운 배열 생성
        for (int i = 0; i < displayArray.length; i++) {
            displayArray[i] = '_';
            // 선택된 단어의 길이에 '_' 넣어주기 (기본값)
        }

        int tries = 0; // 사용자가 시도한 횟수
        final int MAX_TRIES = 7; // 최대 시도 횟수(상수)
        Scanner scanner = new Scanner(System.in);
        boolean wordCompleted = false;

        // 최대 시도 횟수를 넘어서거나, 단어가 완성되면 종료(and 조건)
        while(tries < MAX_TRIES && !wordCompleted) {
            System.out.println("단어 추측: ");
            printDisplayArray(displayArray);

            String guess = scanner.next();
            // 사용자로부터 입력받기

            if(guess.length() !=1) {
                System.out.println("한 글자만 입력해주세요");
                 continue;
                 // 문자 출력 후 계속해서 진행
            }
            char guessLetter = guess.charAt(0);
            boolean isCorrectGuess = false;

            // 추측한 글자 처리 로직 구현
            // 선택된 단어를 순회하며 추측한 글자가 있는지 확인
            for (int i = 0; i < selectedWord.length(); i++) {
                // 맞췄을 경우
                if(selectedWord.charAt(i) == guessLetter) {
                    displayArray[i] = guessLetter;
                    // '_' -> 맞추 글자로 변경
                    isCorrectGuess = true;
                }
            }

            // 틀렸을 경우
            if (! isCorrectGuess) {
                tries++;
                System.out.println("없는 글자입니다. 남은 시도는 " + (MAX_TRIES - tries));
            }

            // 게임종료 조건 검사
            wordCompleted = isWordCompleted(displayArray);
        }
        // 게임 종료 후 정답 단어와 승리 또는 패배 메시지 출력
        if(wordCompleted) {
            System.out.println("축하합니다!");
        } else {
            System.out.println("틀렸습니다. 정답은 " + selectedWord + "입니다." );
        }

    }

    // 메서드 선언

    // 1. 현재까지 맞춘 단어의 상태를 출력하는 메서드
    private static void printDisplayArray(char [] displayArray){
        for (char c : displayArray) {
            System.out.print(c + " ");
            // 하나도 안 맞췄을 땐 c가 모든 "_"로 되어 있음
        }
        System.out.println();
        // 행 변경

    }

    // 2. 단어가 모두 맞춰졌는지 확인하는 메서드
    private static boolean isWordCompleted(char [] displayArray) {
        for (char c : displayArray) {
            if(c == '_') {
                return false;
            }
        }
        return true;
    }
}
