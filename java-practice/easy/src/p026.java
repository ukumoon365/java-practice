import java.util.Scanner;

public class p026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1..N 홀수만 출력
        // 1. 정수 입력
        // 2. N번 반복
        // 3. 홀수만 출력

        // 정수 입력
        int n = sc.nextInt();

        // 1..N 홀수만 출력 for문
        for (int i = 1; i <= n; i++){
            // 짝수 판별 if문
            if (i % 2 == 0) {
                continue;
            }
            // 홀수만 출력
            System.out.print(i + " ");
        }
    }
}
