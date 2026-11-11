import java.util.Scanner;

public class p065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 약수 쌍의 개수
        // 1.정수 입력
        // 2. i*i <= n 순회
        //      1) 약수 판별
        //          1.약수 개수 카운트
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 카운트 변수 초기화
        int count = 0;

        // i*i <= n 순회 for문
        for (int i = 1; i*i <= n; i++) {
            // 약수 판별 if문
            if (n % i == 0) {
                count++;
            }
        }
        // 결과 출력
        System.out.println("약수 쌍 개수: " + count);
    }
}