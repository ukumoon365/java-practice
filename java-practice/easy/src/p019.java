import java.util.Scanner;

public class p019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력 검증 — 1~100 범위
        // 1. 정수 입력
        // 2. 1이상 100이하의 수가 입력 될 때까지 반복
        // 3. 결과 출력

        // 변수 선언
        int x;

        // 1 이상 100 이하의 유효한 정수를 받을 때까지 do-while문
        do {
            x = sc.nextInt(); // 정수 입력
        } while (x < 1 || x > 100);

        // 결과 출력
        System.out.println("입력값: " + x);
    }
}

