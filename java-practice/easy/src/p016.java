import java.util.Scanner;

public class p016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 팩토리얼
        // 1. 12 이하의 정수 입력
        // 2. 팩토리얼 반복문
        // 3. 결과 출력

        // 12 이하 정수 입력
        int n = sc.nextInt();

        // 팩토리얼 계산 결과 변수
        long result = 1;

        // 팩토리얼 계산 for문
        for (int i = 2; i <= n; i ++) {
            result *= i;
        }

        // 결과 출력
        System.out.println(n + "! = " + result);

    }
}
