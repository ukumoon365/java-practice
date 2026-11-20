import java.util.Scanner;

public class p079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int step = sc.nextInt();
        // 스텝 수열
        // 1. 시작, 끝, 스텝 값 입력
        // 2. 시작~끝 스텝 간격으로 순회
        //      1) 출력

        // 시작~끝 스텝 간격으로 순회
        for (int i = a; i <= b; i += step){
            // 출력
            System.out.print(i);
            if (i + step <= b){
                System.out.print(" ");
            }
        }
    }
}