import java.util.Scanner;

public class p085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 제곱 수열
        // 1. 정수 입력
        // 2. 1~n까지 반복
        //      1) 제곱값 n 초과 판별
        //          1. 반복 종료

        int n = sc.nextInt();

        // 1~n까지 반복 for문
        for (int i =1; i*i <= n; i++) {
            // 제곱값 n초과 판별 if문
            if (i*i > n) {
                break;
            }    
            System.out.print(i*i + " ");
            
        } 
    }
}
