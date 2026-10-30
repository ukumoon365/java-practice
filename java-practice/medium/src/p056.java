import java.util.Scanner;

public class p056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 인접 두 값의 최대 곱
        // 1. 정수 입력
        // 2. n번 반복 
        //      1) 인접한 두 수의 곱 계산
        //      2) 최댓값 갱신
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 정수 입력
        int prev = sc.nextInt();

        // 최대값 변수 초기화
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            // 정수 입력
            int cur = sc.nextInt();

            // 인접한 두 수의 곱을 계산 최댓값 갱신
            max = Math.max(max, prev * cur);

            // 비교값 수정
            prev = cur;
        }

        // 결과 출력
        System.out.println("연속 두 값의 최대 곱: " + max);
    }
}