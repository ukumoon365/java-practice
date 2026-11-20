import java.util.Scanner;

public class p078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 역순 구간 b..a
        // 1. 시작, 끝 입력
        // 2. 끝~시작 역순 순회
        //      1) 결과 출력

        // 정수 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        // end~start 역순 순회
        for (int i = b; i >= a; i--) {
            System.out.print(i);
            if (i > a) System.out.print(" ");
        }
    }
}
