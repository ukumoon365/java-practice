import java.util.Scanner;

public class p031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1..N 의 홀수 합 / 짝수 합
        // 1. 정수 입력
        // 2. 1부터 n까지 반복
        // 3. 홀수, 짝수 판별
        // 4. 홀수만, 짝수만 누적합
        // 5. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 홀수, 짝수 누적합 변수 초기화
        int oddSum = 0;
        int evenSum = 0;

        // 1부터 n까지 반복 for문
        for (int i = 1; i <= n; i++){
            // 짝수 판별 if문
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        // 결과 출력
        System.out.println("홀수 합: " + oddSum);
        System.out.println("짝수 합: " + evenSum);
    }
}