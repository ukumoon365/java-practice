import java.util.Scanner;

public class p030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 자릿수 합
        // 1. 정수 입력
        // 2. 각 자릿수 합을 구하는 반복문
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 누적합 변수 초기화
        int totalSum = 0;

        // 정수 복사 변수 초기화
        int copyN = n;

        // 각 자릿수 합을 구하는 반복 while문
        while (copyN > 0) {
            totalSum += copyN % 10;
            copyN /= 10;
        }

        // 결과 출력
        System.out.println("자릿수 합: " + totalSum);
    }
}