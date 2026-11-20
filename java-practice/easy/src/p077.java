import java.util.Scanner;

public class p077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 구간 a..b 나열
        // 1. 정수 입력
        // 2. a ~ b까지 순회
        //      1) 출력

        // 정수 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        // a ~ b까지 순회
        for (int i = a; i <= b; i++) {
            // 결과 출력
            System.out.print(i + " ");
        }
    }
}
