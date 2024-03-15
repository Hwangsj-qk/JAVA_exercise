package method.ex;

import java.util.Scanner;

public class Ex6 {
            /*
        성적을 관리하는 프로그램
         1. 새로운 성적을 배열에 추가
         2. 성적의 평균을 계산
         3. 최고 성적을 조회
         4. 성적 분포를 출력 (A, B, C, D, F) (90, 80, 70, 60, 60이하
         */
            public static void main(String[] args) {
                int [] scores = new int[0];

                Scanner scanner = new Scanner(System.in);

                // 1. 배열에 성적 추가
                while (true) {
                    System.out.print("성적을 입력하세요 (종료시 -1 입력): ");
                    int score = scanner.nextInt();

                    if (score == -1) {      // -1 입력 시 종료
                        break;
                    }
                    scores = addScores(scores,score);       // 배열에 새로운 성적 추기
                }

                // 2. 평균 계산
                System.out.println("평균: " + calculateAverage(scores));

                // 3. 최고 성적 조회
                System.out.println("최고 점수: " + findMaxSocre(scores));

                // 4. 성적 분포도 출력
                printSocreDistribution(scores);

            }

            // 성적을 추가하는 메서드
            public static int[] addScores(int [] scores, int score) {
                int [] newScores = new int[scores.length + 1];
                // 추가해야하므로 이전 배열의 길이보다 1 크게 만들어야 함
                for (int i = 0; i < scores.length; i++) {
                    newScores[i] = scores[i];
                    // 기존의 배열을 순회하며 새로운 배열에 내용을 '복사'한다.
                }
                newScores[newScores.length-1] = score;
                // ※ 인덱스는 '0'부터 시작하기 때문에 -1을 해줘야 한다.

                scores = newScores;
                // newScores 배열을 scores에 그대로 복사

                return scores;
            }

            // 평균을 계산하는 메서드
            public static double calculateAverage(int[] scores) {
                double sum = 0;
                for (int score : scores) {
                    sum += score;
                }
                return sum/scores.length;
            }

            // 최고 점수를 찾는 메서드
            public static int findMaxSocre(int[] scores) {
                int max = scores[0];

                for (int score : scores) {
                    if(score > max) {
                        score = max;
                    }
                }
                return max;
            }

            // 성적 분포도를 출력하는 메서드
            public static void printSocreDistribution(int [] scores) {
                int [] distribution = new int[5];
                // 총 5개의 분포를 담는 배열

                for (int score : scores) {
                    if(score >= 90) {
                        distribution[0]++;
                        // 90점이 넘으면 distribution의 0번지에 + 1(카운트)
                    } else if (score >= 80) {
                        distribution[1] ++;
                    } else if (score >= 70) {
                        distribution[2]++;
                    } else if (score >= 60) {
                        distribution[3]++;
                    } else {
                        distribution[4]++;
                    }
                }
                System.out.println("성적 분포도");
                System.out.println("성적 분포도");
                System.out.println("A :" + distribution[0] + "명");
                System.out.println("B :" + distribution[1] + "명");
                System.out.println("C :" + distribution[2] + "명");
                System.out.println("D :" + distribution[3] + "명");
                System.out.println("F :" + distribution[4] + "명");
            }
}
