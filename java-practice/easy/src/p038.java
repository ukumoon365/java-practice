import java.util.Scanner;

public class p038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N 의 약수 개수
        // 1. 정수 입력
        // 2. √n번 반복
        //      1) n의 약수 개수 카운트
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 약수 카운트 변수 초기화
        long divisorCount = 0;

        // √n번 반복 for문
        for (int i = 1; (long)i * i <= n; i++) {
            // n의 약수 판별 if문
            if (n % i == 0) {
                divisorCount++; // i 자체가 약수
                if (i != n / i) {
                    divisorCount++; // 쌍이 되는 약수 n/i 도 카운트
                }
            }
        }
        // 결과 출력
        System.out.println("약수 개수: " + divisorCount);
    }
}
