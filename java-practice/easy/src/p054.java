import java.util.Scanner;

public class p054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 자릿수 중 최댓값
        // 1. 정수 입력
        // 2. 자릿수가 1이 될 때까지 반복
        //      1) 각 자릿수 값을 구함
        //      2) 해당 자릿수의 값 비교
        //          1. 최댓값 갱신
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 자릿수값 변수 초기화
        int digits = n;
        // 최댓값 변수 초기화
        int max = Integer.MIN_VALUE;

        // 자릿수가 1이 될 때까지 반복 while문
        while (n > 0) {
            digits = n % 10;
            n = n / 10;
            // 최댓값 비교 if문
            if (digits > max) {
                max = digits;
            }
        }

        // 결과 출력
        System.out.println("자릿수 최댓값: " + max);
    }
}
