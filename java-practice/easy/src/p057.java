import java.util.Scanner;

public class p057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N의 약수 나열
        // 1. 정수 입력
        // 2. 1~n 반복
        //      1) 약수 판별
        //      2) 약수 출력

        // 정수 입력
        int n = sc.nextInt();

        // 1~n 반복 for문
        for (int i = 1; i <= n; i++) {
            // 약수 판별 if문
            if (n % i == 0) {
                // 결과 출력
                System.out.print(i + " ");
            }
        }
    }
}
