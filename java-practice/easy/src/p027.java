import java.util.Scanner;

public class p027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 구간 합 a..b
        // 1. 시작점 a, 끝점 b 입력
        // 2. a부터 b까지 구간의 누적합을 계산하는 반복문
        // 3. 결과 출력

        // 시작점 a, 끝점 b 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 누적합 변수 초기화
        int totalSum = 0;

        // a부터 b까지의 구간 누적합 for문
        for (int i = a; i <= b; i++) {
            totalSum += i;
        }

        // 결과 출력
        System.out.println("합계: " + totalSum);
    }
}
