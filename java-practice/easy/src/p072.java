import java.util.Scanner;

public class p072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 자릿수 제곱합
        // 1. 정수 입력
        // 2. 자릿수 반복
        //      1) 각 자리수 제곱 및 누적합
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 결과값 변수 초기화
        int result = 0;

        // 자릿수 반복 while문
        while (n > 0) {
            int digit = n % 10;
            result += digit * digit;

            n /= 10;
        }

        // 결과 출력
        System.out.println("제곱합: " + result);
    }
}
