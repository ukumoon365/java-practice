import java.util.Scanner;

public class p068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 자릿수의 곱
        // 1. 정수 입력
        // 2. n 순회
        //      1) 자릿수 곱 계산
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 입력값 복사 변수 초기화
        int t = n;

        // 결과값 변수 초기화
        int result = 1;

        // 자릿수 순회 while문
        while (t > 0) {
            int digits = t % 10;

            // 자릿수 곱 계산
            result *= digits;
            t /= 10;

        }

        // 결과 출력
        System.out.println("자릿수 곱: " + result);
    }
}
