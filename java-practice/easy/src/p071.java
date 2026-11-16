import java.util.Scanner;

public class p071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 뒤 k자리
        // 1. 정수  입력
        // 2. 1~k만큼 반복
        //      1. 10^i 계산
        // 3. k번째 자릿수 출

        // 정수 입력
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 자릿수 변수 초기화
        int divisor = 1;

        // 10^k 계산
        for (int i = 1; i <= k; i++) {
            divisor *= 10;
        }

        // 뒤 k자리
        int result = n % divisor;

        // 결과 출력
        System.out.println("뒤 " + k + "자리: " + result);
    }
}
