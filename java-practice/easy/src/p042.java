import java.util.Scanner;

public class p042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 윤년 개수
        // 1. 연도 범위 a,b 입력
        // 2. a부터 b까지 순회
        // 3. 윤년 규칙에 맞는 해 판별 및 카운트
        // 4. 결과 출력

        // 정수 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 카운트 변수 초기화
        int leapYearCount = 0;

        // a,b 순회 for문
        for (int i = a; i <= b; i++) {
            // 윤년 판별 if문
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                // 윤년 카운트
                leapYearCount++;
            }
        }
        // 결과 출력
        System.out.println("윤년 개수: " + leapYearCount);

    }
}
