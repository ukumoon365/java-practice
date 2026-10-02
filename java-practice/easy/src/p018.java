import java.util.Scanner;

public class p018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N 이하 2의 거듭제곱
        // 1. 정수 입력
        // 2. n이하 2의 거듭제곱 구하는 반복문
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();
        // 결과값 초기화 
        int result = 1;
        // n이하의 2의 거듭제곱 while문
        while (result <= n) {
            System.out.print(result + " ");
            result *= 2;
        }
    }
}