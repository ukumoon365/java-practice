import java.util.Scanner;

public class p048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n개 정수의 최솟값
        // 1. 정수 입력
        // 2. n번 반복
        //      1) 정수 입력
        //      2) 최솟값 비교
        //          1. 최솟값 갱신
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 최솟값 변수 초기화
        int minResult = Integer.MAX_VALUE;

        // n번 반복 for문
        for (int i = 0; i < n; i ++) {
            // 정수 입력
            int num = sc.nextInt();

            // 최솟값 비교 if문
            if (num < minResult) {
                minResult = num;
            }
        }
        // 결과 출력
        System.out.println("최솟값: " + minResult);
    }
}
