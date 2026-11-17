import java.util.Scanner;

public class p074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 자릿수 범위
        // 1. 정수 입력
        // 2. 정수 순회
        //      1) 자릿수 비교
        //          1. 최대,최솟값 갱신
        // 3. 최대, 최솟값 빼기
        // 4. 결과 출력

        // 정수 입력
        long n = sc.nextLong();

        // 최대, 최솟값 변수 초기화
        long max = 0;
        long min = 9;

        // 정수 순회 while문
        while (n > 0) {
            long digit = n % 10;

            if (digit > max) {
                max = digit;
            }
            if (digit < min) {
                min = digit;
            }

            n /= 10;
        }

        // 자릿수 범위 계산
        long result = max - min;

        // 결과 출력
        System.out.println("범위: " + result);
    }
}
