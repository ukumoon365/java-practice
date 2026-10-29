import java.util.Scanner;

public class p053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 최대값의 위치
        // 1. 정수 입력
        // 2. n번 반복 for문
        //      1) 정수 입력
        //      2) 최대값 비교
        //          1. 최대값 갱신
        //          2. 인덱스 값 저장
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 최대값 변수 초기화
        int max = Integer.MIN_VALUE;
        // 위치 값 변수 초기화
        int maxPosition = 0;

        // n번 반복 for문
        for (int i = 0; i < n; i++) {
            // 정수 입력
            int num = sc.nextInt();

            // 최대값 비교 if문
            if (num > max) {
                max = num;
                maxPosition = i + 1;
            }
        }
        // 결과 출력
        System.out.println("최댓값의 위치: " + maxPosition);
    }
}