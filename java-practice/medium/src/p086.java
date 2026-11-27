import java.util.Scanner;

public class p086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 산 모양 수열
        // 1. 정수 입력
        // 2. 1~2n-1 반복
        //      1) Math.min(i, 2*n - i) 출력

        int n = sc.nextInt();

        // 1~2n-1 반복 for문
        for (int i = 1; i <= 2*n - 1; i++) {
            System.out.print(Math.min(i, 2*n - i) + " ");
        }
    }
}