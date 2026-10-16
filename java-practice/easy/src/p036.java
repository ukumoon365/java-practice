import java.util.Scanner;

public class p036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 교대 덧셈
        // 1. 정수 입력
        // 2. n번 반복
        //  1) 홀수, 짝수 판별
        //  2) 홀수는 더하기 / 짝수는 빼기
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();
        // 결과값 변수 초기화
        long result = 0;

        // n번 반복 for문
        for (int i = 1; i <= n; i++) {
            // 홀수, 짝수 판별
            if (i % 2 == 0) {
                // 짝수 빼기
                result -= i;
            } else {
                // 홀수 더하기
                result += i;
            }
        }
        // 결과 출력
        System.out.println("결과: " + result);
    }
}
