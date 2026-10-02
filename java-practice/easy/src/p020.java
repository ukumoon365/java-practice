import java.util.Scanner;

public class p020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0 입력 시 종료
        // 1. 정수 입력
        // 2. 0이 입력될 때 까지 반복
        // 3. 입력값 누적합 계산
        // 4. 결과 출력

        // 변수 선언 및 초기화
        int n;
        int sum = 0;

        // 정수 입력 및 누적합 계산 반복
        do {
            n = sc.nextInt();   // 정수 입력
            sum += n;   // 누적합 계산
        } while (n != 0); // 입력값이 0일 시 중지

        // 누적합 값 출력
        System.out.println("합계: " + sum );

    }
}
