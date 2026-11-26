import java.util.Scanner;

public class p084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 별 한 줄 출력
        // 1. 정수 입력
        // 2. n번 반복
        //      1) 별 출력
        // 3. 마지막 줄 바꿈 출력

        int n = sc.nextInt();

        // n번 반복 for문
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
