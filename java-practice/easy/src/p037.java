import java.util.Scanner;

public class p037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1..N 중 K의 배수 개수
        // 1. n,k 값 입력
        // 2. k 배수 값 계산
        // 3. 결과 출력

        // 두개의 정수 입력
        int n = sc.nextInt();
        int k = sc.nextInt();

        // k의 배수 개수 계산
        long kMultiple = n / k;

        // 결과 출력
        System.out.println(k + "의 배수 개수: " + kMultiple);
    }
}
