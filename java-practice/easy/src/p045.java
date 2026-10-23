import java.util.Scanner;

public class p045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1..N 중 3과 5의 공배수 개수
        // 1. 정수 입력
        // 2. n번 반복
        //      1) 1부터 n까지 3,5의 공배수 판정 및 카운트
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 공배수 카운트 변수 초기화
        int commonMultipleCount = 0;

        // 1부터 n번 반복 for문
        for (int i = 1; i <= n; i++) {
            // 3,5 공배수 판별 if문
            if (i % 3 == 0 && i % 5 == 0) {
                commonMultipleCount++; // 카운트
            }
        }

        // 결과 출력
        System.out.println("공배수 개수: " + commonMultipleCount);
    }
}
