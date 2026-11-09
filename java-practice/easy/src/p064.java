import java.util.Scanner;

public class p064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1 초과 가장 작은 약수
        // 1. 정수 입력
        // 2. 2~n까지 순회
        //      1) 약수 판별 및 가장 작은 약수 판별
        //      2) 가장 작은 약수 갱신
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 가장 작은 약수 값 초기화
        int result = n;

        // 2~n까지 순회 for문
        for (int i = 2; i < n; i++){
            if ( n % i == 0 && i < result) {
                result = i;
            }
        }

        // 결과 출력
        System.out.println("최소 진약수: " + result);
    }
}