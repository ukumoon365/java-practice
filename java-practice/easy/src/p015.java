import java.util.Scanner;

public class p015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1..N 짝수 합
        // 1. 정수입력
        // 2. 1부터 n까지의 작수의 합 계산 반복문
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 결과 값 변수 선언
        int total = 0;

        // 1부터 n까지의 짝수의 합 계산 for문
        for (int i = 2; i <= n; i += 2){
            total += i;
        }
        // 결과 출력
        System.out.println("짝수 합: " + total);
    }
}
