import java.util.Scanner;

public class p021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 직사각형 별 출력
        // 1. 행, 열값 입력
        // 2. 행 반복, 열 반복 이중 반복문
        // 3. 별 출력 및 줄 바꿈
        
        // 행, 열 입력
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        // 행 반복문
        for (int row = 0; row < rows; row ++) {
            // 열 반복문
            for (int col = 0; col < cols; col ++) {
                System.out.print("*"); // 별 출력
            }
            // 줄 바꿈
            System.out.println();
        }
    }
}