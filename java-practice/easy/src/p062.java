import java.util.Scanner;

public class p062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a 또는 b 의 배수 개수
        // 1. 정수 입력
        // 2. 1~n까지 순회
        //      1) a 또는 b 배수 개수 카운트
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 카운트 변수 초기화
        int count = 0;

        // 1~n까지 순회 for문
        for (int i = 1; i <= n; i++) {
            // a | b 배수 카운트
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }

        // 결과 출력
        System.out.println("개수: " + count);
    }
}
