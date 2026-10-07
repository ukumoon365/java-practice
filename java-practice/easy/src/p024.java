import java.util.Scanner;

public class p024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        // 0 입력시 종료
        // 1. 단일 반복
        // 2. 정수 입력
        // 3. 0인지 판별
        // 4. 0이면 반복 종료
        // 5. 0이 아니면 입력값 누적합
        // 6. 누적합값 출력

        // 단일 반복문
        while (true) {

            // 정수 입력
            int num = sc.nextInt();

            // 0 판별 if문
            if (num == 0) {
                break;
            }

            // 누적합
            sum += num;
        }
        // 합계 출력
        System.out.println("합계: " + sum);
    }
}
