import java.util.Scanner;

public class p003 {
    public static void main (String[] args) {
        // 홀짝 판별
        // 1. 정수 입력
        // 2. if문을 사용하여 홀짝 판별 및 결과 출력
        Scanner sc = new Scanner(System.in);

        // 정수 입력
        int n = sc.nextInt();

        // 입력 받은 정수가 짝수면 짝수 출력 / 홀수면 홀수 출력
        if (n % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
