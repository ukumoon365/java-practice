import java.util.Scanner;

public class p069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 숫자 뒤집기
        // 1. 정수 입력
        // 2. n 순회
        //      1) 자릿수 저장 (뒤집은 숫자)
        // 3. 결과 출력

        // 정수 입력
        long n = sc.nextLong();
        
        // 입력값 복사 변수 초기화
        long temp = n;
        
        // 결과값 변수 초기화
        long reversed = 0;

        // 자릿수 순회 while문
        while (temp > 0) {
            // 숫자 뒤집기
            reversed = reversed * 10 + temp % 10; 

            temp /= 10;

        }

        // 결과 출력
        System.out.println("뒤집은 수: " + reversed);
    }
}
