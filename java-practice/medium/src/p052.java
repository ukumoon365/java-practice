import java.util.Scanner;

public class p052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 두 번째로 큰 값
        // 1. 정수 입력
        // 2. n번 반복
        //      1) 정수 입력
        //      2) 최대값 비교
        //          1. 클 경우 최댓값 갱신
        //          2. 최댓값보단 작고 두 번째 값보다 크면 두번째 값 갱신
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 최대값 변수 초기화
        int max = sc.nextInt();
        // 두 번째 값 변수 초기화
        int second = Integer.MIN_VALUE; // 음수 방지
        // n번 반복 for문
        for (int i = 1; i < n; i++) {
            // 정수 입력
            int num = sc.nextInt();

            // 최대값, 두번째 값 비교 if문
            if (num > max) {
                second = max;
                max = num;
            } else if (num > second) {
                second = num;
            }
        }
        // 결과 출력
        System.out.println("두 번째로 큰 값: " + second);
    }
}
