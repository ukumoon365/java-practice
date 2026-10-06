import java.util.Scanner;

public class p022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 부분 구구단 
        // 1. 시작, 끝단 입력
        // 2. 구구단 출력 반복문
        //      구구단 계산 및 출력
        // 3. 줄 바꿈 출력

        // 시작, 끝단 입력
        int start = sc.nextInt();
        int end = sc.nextInt();

        // 외부 반복문 dan
        for (int dan = start; dan <= end; dan++) {
            // 내부 반복문 1부터 9까지 계산
            for (int num = 1; num <= 9; num++) {
                System.out.println(dan + " x " + num + " = " + (dan * num));
            }
            // 각 단이 끝날 때 빈 줄 출력
            System.out.println();
        }
    }
}
