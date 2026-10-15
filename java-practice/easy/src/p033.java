import java.util.Scanner;

public class p033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N 개 중 양수의 합
        // 1. 정수 입력
        // 2. N번 반복하며 정수 입력
        // 3. 양수만 누적합
        // 4. 결과 출력

        // 누적합 변수 초기화
        long totalSum = 0;

        // 정수 입력
        int n = sc.nextInt();

        // n번 반복 for문
        for (int i = 1; i <= n; i++) {
            // 정수 입력
            int num = sc.nextInt();

            // 양수 판별 if문
            if (num > 0) {
                totalSum += num;
            }
        }
        // 결과 출력
        System.out.println("양수 합: " + totalSum);
    }
}
