import java.util.Scanner;

public class p017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 자릿수 세기
        // 1. 정수 입력
        // 2. 자릿수 세기 반복문
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // n 복사본 변수 초기화
        int copyN = n;
        // 자릿수 카운트 변수 초기화
        int count = 0;

        // 자릿수 세기 while문
        while (copyN > 0) {
            copyN = copyN / 10;
            count ++;
        }
        System.out.println(count + "자리");
    }
}
