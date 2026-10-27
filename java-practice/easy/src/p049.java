import java.util.Scanner;

public class p049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 최댓값과 최솟값 동시
        // 1. 정수 입력
        // 2. n번 반복
        //      1) 정수 입력
        //      2) 최댓값 비교
        //          1. 최댓값 갱신
        //      3) 최솟값 비교
        //          1. 최솟값 
        // 3. 결과 출력
        
        // 정수 입력
        int n = sc.nextInt();

        // 최댓값,최솟값 변수 초기화
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        
        // n번 반복 for문
        for (int i = 0; i < n; i++) {
            // 정수 입력
            int num = sc.nextInt();

            min = Math.min(min, num);
            max = Math.max(max, num);
        }
         // 결과 출력
        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
    }
}