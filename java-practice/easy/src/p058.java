import java.util.Scanner;

public class p058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N 이하의 K 의 배수 나열
        // 1. 두 정수 입력
        // 2. 1~n까지 반복
        //      1) k의 배수 출력

        // 정수 입력
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 1~n까지 반복
        for (int i = 1; i <= n; i++) {
            // k의 배수 검사 if문
            if (i % k == 0) {
                // k의 배수 출력
                System.out.print(i + " ");
            }
        }
    }
}
