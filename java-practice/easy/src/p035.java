import java.util.Scanner;

public class p035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n개 점수의 평균
        // 1. 정수 입력
        // 2. n번 반복 / 정수 입력
        // 3. n개의 평균 계산
        // 4. 결과 출력

        // 정수 입력
        int n = sc.nextInt();
        // 총합 변수 초기화
        long sum = 0;

        // n번 반복 for문
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        // 평균 계산
        double avg = (double) sum / n;

        // 결과 출력
        System.out.printf("평균: %.2f%n", avg);
    }
}
