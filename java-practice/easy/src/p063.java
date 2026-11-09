import java.util.Scanner;

public class p063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 가장 큰 진약수
        // 1. 정수 입력
        // 2. 1~n까지 순회 
        //      1) 진약수 갱신
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 결과 변수 초기화
        int result = 1;

        // 1~n까지 순회 for문
        for (int i = 1; i < n; i++) {
            // 진약수 갱신
            if (n % i == 0) {
                result = i;
            }
        }

        // 결과 출력
        System.out.println("가장 큰 진약수: " + result);
    }
}