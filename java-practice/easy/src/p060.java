import java.util.Scanner;

public class p060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 완전수 판정
        // 1. 정수 입력
        // 2. 1~n-1까지 순회
        //      1) 약수 판별
        //          1. 총 누적합
        // 3. 완전수 판별
        //      1) 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 누적합 변수 초기화
        int sum = 0;

        // 1~n-1까지 순회 for문
        for (int i = 1; i < n; i++) {
            // 약수 판별 if문
            if (n % i == 0) {
                sum+= i;
            }
        }
        // 완전수 판별 if문 / 결과 출력
        if (sum == n) {
            System.out.println("완전수");
        } else {
            System.out.println("완전수 아님");
        }
    }
}