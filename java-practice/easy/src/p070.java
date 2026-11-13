import java.util.Scanner;

public class p070{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 맨 앞 자리
        // 1. 정수 입력
        // 2. n 순회
        //      1) 자리값 갱신
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 입력값 복사 변수 초기화
        int temp = n;
        
        // 결과값 변수 초기화
        int result = 0;

        // 자릿수 순회 while문
        while (temp > 0) {
            // 자릿수 갱신
            result = temp % 10;
            temp /= 10;
        }

        // 결과 출력
        System.out.println("맨 앞 자리: " + result);
    }
}
