import java.util.Scanner;

public class p041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 합격자 수
        // 1. 정수 입력
        // 2. n번 반복
        //      1) 점수 입력
        //      2) 60점 이상 판별
        //      3) 60점 이상만 카운트
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 합격자 카운트 변수 초기화
        int passCount = 0;

        // n번 반복 for문
        for (int i = 0; i < n; i++) {
            // 점수 입력
            int score = sc.nextInt();

            // 합격자 판별 if문
            if (score >= 60) {
                passCount++;
            }
        }
        // 결과 출력
        System.out.println("합격자 수: " + passCount);
    }
}
