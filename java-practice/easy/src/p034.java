import java.util.Scanner;

public class p034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1²+2²+...+N²
        // 1. 정수 입력
        // 2. n번 반복
        // 3. i*i 값 누적
        // 4. 결과 출력

        // 누적합 변수 초기화
        long totalSum = 0;

        // 정수 입력
        int n = sc.nextInt();

        // n번 반복 for문
        for (int i = 1; i <= n; i++) {
            // 제곱 값 누적합 계산
            totalSum += i*i;
        }

        // 결과 출력
        System.out.println("제곱합: " + totalSum);
    }
}
