import java.util.Scanner;

public class p039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 구간 [a,b] 안에 속하는 개수
        // 1. n, a, b 각 정수 입력
        // 2. n번 반복
        //  1) 정수 입력
        //  2) a, b 구간 내 값 판별
        //  3) 구간 내 값 개수 카운트
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 카운트 변수 초기화
        int rangeInCount = 0;

        // n번 반복 for문
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt(); // 정수 입력

            // 구간 내 값 판별 if문
            if (num >= a && num <= b) {
                rangeInCount += 1;   // 구간 내 값 개수 카운트
            }
        }

        // 결과 출력
        System.out.println("구간 내 개수: " + rangeInCount);
    }
}
