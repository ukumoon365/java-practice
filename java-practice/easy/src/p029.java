import java.util.Scanner;

public class p029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n의 약수 합
        // 1. 정수 입력
        // 2. 1부터 n까지 n의 약수 합 계산 반복문
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 누적합 변수 초기화
        int totalSum = 0;

        // 1부터 n까지 반복 for문
        for (int i = 1; i <= n; i++) {
            // n의 약수 판별 if문
            if (n % i  == 0) {
                totalSum += i;
            }
        }

        // 결과 출력
        System.out.println("약수 합: " + totalSum);
    }
}
