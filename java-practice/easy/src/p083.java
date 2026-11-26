import java.util.Scanner;

public class p083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 쉼표 목록
        // 1. 정수 입력
        // 2. 1~n 순회
        // 3. i == 1 판별
        // 4.   1) 쉼표 목록 출력

        int n = sc.nextInt();

        // 1~n 순회 for문
        for (int i = 1; i <= n; i++){
            // i == 1 판별 if문
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(", " + i);
            }
        }
        System.out.println(("."));
    }
}
