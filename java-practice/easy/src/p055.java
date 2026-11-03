import java.util.Scanner;

public class p055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 최대와 최소의 차이
        // 1. 정수 입력
        // 2. n번 반복
        //      1) 정수 입력
        //      2) 최댓값, 최솟값 비교
        // 3. 최댓값, 최솟값 빼기
        // 4. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 최댓값, 최솟값 변수 초기화
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // n번 반복 for문
        for (int i = 0; i < n; i++) {
            // 정수 입력
            int num = sc.nextInt();

            // 최댓값, 최솟값 비교 if문
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // 차이값 계산
        int difference = max - min;

        // 결과 출력
        System.out.println("차이: " + difference);
    }
}
