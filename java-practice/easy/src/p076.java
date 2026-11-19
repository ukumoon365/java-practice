import java.util.Scanner;

public class p076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 자릿수가 모두 짝수인가
        // 1. 정수 입력
        // 2. 정수 순회
        //      1) 짝수판별 판별 → flag 값 갱신
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // flag 변수 초기화
        boolean flag = true;
        String result = "모두 짝수";

        while (n > 0) {
            long digit = n % 10;

            if (digit % 2 != 0) {
                flag = false;
            }

            n /= 10;
        }

        // 결과 출력
        if (flag) {
            result = "모두 짝수";
        } else {
            result = "홀수 포함";
        }

        System.out.println(result);
    }
}
