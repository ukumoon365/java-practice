import java.util.Scanner;

public class p050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 절댓값이 가장 큰 값
        // 1. 정수 입력
        // 2. n번 반복
        //      1) 정수 입력
        //      2) 절대값이 가장 큰 값 비교
        //          1. 가장 큰 값 갱신
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 가장 큰 값 변수 초기화
        long largest = sc.nextInt(); 

        // n번 반복 for문
        for (int i = 1; i < n; i++) {
            // 정수 입력
            int num = sc.nextInt();

            // 절댓값 값 비교 if문
            if (Math.abs(num) > Math.abs(largest)) {
                // 값 갱신
                largest = num;
            }
        }

        // 결과 출력
        System.out.println("절댓값 최대의 값: " + largest);
    }
}
