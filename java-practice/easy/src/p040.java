import java.util.Scanner;

public class p040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 양수 / 음수 개수
        // 1. 정수 입력
        // 2. n번 반복
        //  1) 정수 입력
        //  2) 양,음수 판별
        //  3) 양, 음수 개수 카운트
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 양수, 음수 카운트 변수 초기화
        int positiveCount = 0;
        int negativeCount = 0;

        // n번 반복 for문
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt(); // 정수 입력

            // 양, 음수 판별 if문
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }

        // 결과 출력
        System.out.println("양수: " + positiveCount);
        System.out.println("음수: " + negativeCount);
    }
}
