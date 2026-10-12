import java.util.Scanner;

public class p028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1..N 중 K의 배수 합
        // 1. n, k값 입력
        // 2. 1부터 n까지 누적합 계산하는 반복문
        // 3. k의 배수만 누적합 하는 필터 if문
        // 4. 결과 출력

        // n, k값 입력
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 누적합 변수 초기화
        int totalSum = 0;

        // 1부터 n까지 누적합 for문
        for (int i = 1; i <= n; i++){
            // k의 배수 판별
            if (i % k == 0){
                totalSum += i;
            }
        }
        // 결과 출력
        System.out.println(k + "의 배수 합: " + totalSum);
    }
}