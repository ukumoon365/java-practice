import java.util.Scanner;

public class p025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1..N 중 3의 배수 제외 합
        // 1. 정수 입력
        // 2. 1부터 n까지 정수 중 3의 배수를 제외한 수를 누적합 반복문
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 누적합 변수 초기화
        int totalSum = 0;

        // 1부터 n까지 정수 중 3의 배수를 제외한 수를 누적합 for문
        for (int i = 1; i <= n; i++) {

            // 3의 배수 판별 if문
            if (i % 3 == 0) {
                continue;
            }
            totalSum += i;
        }

        // 결과 출력
        System.out.println("합계: " + totalSum);
    }
}
