import java.util.Scanner;

public class p044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N 개 정수 중 홀수 개수
        // 1. 정수 입력
        // 2. n번 반복
        //      1) 정수 입력
        //      2) 홀수 판정 및 카운트
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 홀수 카운트 변수 초기화
        int oddCount = 0;


        // n번 반복 for문
        for (int i = 0; i < n; i++) {
            // 정수 입력
            int num = sc.nextInt();

            // 홀수 판별 if문
            if (num % 2 != 0) {
                oddCount++; // 카운트
            }
        }

        // 결과 출력
        System.out.println("홀수 개수: " + oddCount);
    }
}
