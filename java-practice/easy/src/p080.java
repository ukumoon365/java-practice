import java.util.Scanner;

public class p080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 등차수열 출력
        // 1. n번 반복
        //      1) 출력
        //      2) a+=d 계산
        // 2. 결과 출력

        // 정수 입력
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        // 결과값 변수 초기화
        int trem = a;
        for (int i = 0; i < n; i++) {
            // 출력
            System.out.print(trem);
            if (i < n - 1) {
                System.out.print(" ");
            }
            // 등차수열 계산
            trem += d;
        }
    }
}

