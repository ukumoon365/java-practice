import java.util.Scanner;

public class p081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 등비수열 출력
        // 1. n번 반복
        //      1) a * r 계산 및 출력

        // 정수 입력
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        // 결과값 변수 초기화
        long term = a;

        // n번 반복 for문
        for (int i = 0; i < n; i++) {
            System.out.print(term);
            if (i < n-1) {
                System.out.print(" ");
            }
            term *= r;
        }
    }
}