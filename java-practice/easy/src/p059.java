import java.util.Scanner;

public class p059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 소수 판정
        // 1. 정수 입력
        // 2. 2~n-1까지 반복
        //      1) 소수 판별
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 플래그 변수 초기화
        boolean isPrime = true;

        // 2~n-1까지 반복 for문
        for (int i = 2; i < n; i++) {
            // 소수 판별 if문
            if (n%i==0) {
                isPrime = false;
            }
        }
        // 소수 결과 출력
        if (isPrime) {
            System.out.println("소수");
        } else {
            System.out.println("소수 아님");
        }
    }
}
