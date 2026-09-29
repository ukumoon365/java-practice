import java.util.Scanner;

public class p013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 양의 짝수 / 양의 홀수 / 양수 아님
        // 1. 정수 입력
        // 2. 양수 판별
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 결과값 변수 "양수 아님" 초기화
        String result = "양수 아님";

        // 양수 판별 if문
        if (n > 0) {
            // 짝수, 홀수 판별 if문
            if (n % 2 == 0) {
                result = "양의 짝수";
            } else {
                result = "양의 홀수";
            }
        }

        // 결과 출력
        System.out.println(result);
    }
}
