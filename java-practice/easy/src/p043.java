import java.util.Scanner;

public class p043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 자릿수 d 등장 횟수
        // 1. 양의 정수 n, 한 자리 정수 d 입력
        // 2. n의 정수의 자릿수가 0이 될 때까지 반복
        //      1) n의 자릿수와 d의 값이 같은지 판별
        //      2) 값이 같아지는 횟수 카운트
        // 3. 결과 출력

        // 정수 입력
        long n = sc.nextLong();
        int d = sc.nextInt();

        // 등장 횟수 카운트 변수 초기화
        int count = 0;

        // n의 자릿수가 0이 될 때까지 반복 whlie 문
        while (n != 0) {
            // 마지막 자릿수 판별
            if (n % 10 == d) {
                count++;
            }
            n /= 10;
        }

        System.out.println("등장 횟수: " + count);
    }
}

