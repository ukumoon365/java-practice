import java.util.Scanner;

public class p046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 합이 m 초과까지 필요한 항 수
        // 1. 정수 입력
        // 2. 1부터 누적합이 m를 초과 할 때까지 반복
        //      1) i값을 1씩 증가
        //      2) 누적합
        //      3) 카운트 1증가
        // 3. 결과 출력

        // 정수 입력
        int m = sc.nextInt();

        // 누적합 변수 초기화
        int totalSum = 0;
        // 인덱스 변수 초기화
        int i = 0;
        // 카운트 변수 초기화
        int count = 0;

        // 누적합 값이 m를 초과하지 않는 동안 반복 while문
        while(totalSum <= m) {
            i++; // 인덱스 값 증가
            totalSum += i; // 누적합 계산
            count++; // 카운트 증가
        }

        // 결과 출력
        System.out.println("필요한 항 수: " + count);
    }
}
