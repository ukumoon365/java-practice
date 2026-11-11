import java.util.Scanner;

public class p066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 두 수의 공약수 나열
        // 1. 두 정수 입력
        // 2. 1부터 두 정수 중 작은수까지 순회
        //      1) 두 수의 공약수 판별
        //          1. 공약수 출력

        // 정수 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 두 수중 작은 수 변수 초기화
        int limit = Math.min(a, b);

        // 1부터 limit까지 순회 for문
        for (int i = 1; i <= limit; i++){
            // 두 수 공약수 판별 if문
            if (a % i == 0 && b % i == 0) {
                // 결과 출력
                System.out.print(i + " ");
            }
        }
    }
}
