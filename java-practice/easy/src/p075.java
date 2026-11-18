import java.util.Scanner;

public class p075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 자릿수의 0이 있는가 (break 금지)
        // 1. 정수 입력
        // 2. 정수 순회
        //      1) 0 유무 판별 → flag 값 갱신
        // 3. 결과 출력

        // 정수 입력
        long n = sc.nextLong();

        // flag 변수 초기화
        boolean flag = false;
        String result = "없음";

        while (n > 0) {
            long digit = n % 10;

            if (digit == 0) {
                flag = true;
            }

            n /= 10;
        }

        // 결과 출력
        if (flag) {
            result = "있음";
        }

        System.out.println(result);
    }
}
