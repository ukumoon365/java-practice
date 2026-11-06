import java.util.Scanner;

public class p061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 최대 공약수
        // 1. 두 정수 입력
        // 2. 1~ 두 정수 중 작은 수까지 순회
        //      1) 공약수 판별
        //      2) 최대 공약수 갱신
        // 3. 결과 출력

        // 정수 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 두 정수 중 작은 수 변수 초기화
        int limit = Math.min(a, b);
        // 최대공약수 변수 초기화
        int gcd = 1;

        // 1~limit까지 순회 for문
        for (int i = 1; i < limit; i++) {
            // 공약수 판별 if문
            if (a%i==0 && b%i==0) {
                gcd = i;
            }
        }
        // 결과 출력
        System.out.println("GCD: " + gcd);
    }
}

