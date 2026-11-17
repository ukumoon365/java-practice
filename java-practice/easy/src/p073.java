import java.util.Scanner;

public class p073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 짝수 자릿수 개수
        // 1. 정수 입력
        // 2. 자릿수 반복
        //      1) 각 자리수 짝수 판별
        //          1. 개수 카운트
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 결과값 변수 초기화
        int count = 0;

        // 자릿수 반복 while문
        while (n > 0) {
            int digit = n % 10;

            // 짝수 판별 if문
            if (digit % 2 == 0) {
                count++;
            }

            n /= 10;
        }

        // 결과 출력
        System.out.println("짝수 자리 개수: " + count);
    }
}
