import java.util.Scanner;

public class p032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N 개 정수의 합
        // 1. 정수 입력
        // 2. n번 반복 / 정수 입력
        // 3. 입력 받은 정수 누적합
        // 4. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 누적합 변수 초기화
        long sum = 0;

        // n번 반복 정수 입력 foa문
        for (int i = 1; i <= n; i++) {
            sum += sc.nextInt();
        }

        // 결과 출력
        System.out.println("합계: " + sum);
    }
}