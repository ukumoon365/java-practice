import java.util.Scanner;

public class p067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 자릿수 중 최솟값
        // 1. 정수 입력
        // 2. n 순회
        //      1) 자릿수 최솟값 갱신
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 입력값 복사 변수 초기화
        int t = n;

        // 최솟값 변수 초기화
        int min = 9;

        // 자릿수 순회 while문
        while (t > 0) {
            int digits = t % 10;
            // 최솟값 판별 if문
            if (digits < min) {
                min = digits;
            }
            t /= 10;

        }

        // 결과 출력
        System.out.println("자릿수 최솟값: " + min);
    }
}
