import java.util.Scanner;

public class p023 {
    public static void main(String[] args) {
        // 누적합이 100을 처음 넘는 k
        // 1. 단일 반복문
        // 2. 누적합 값이 100이 넘으면 반복 종료
        // 3. 결과 출력

        // 변수 선언
        int total = 0;
        int k = 0;


        // 단일 반복문
        while (true) {
            k++;
            total += k;

            // 누적합 값 판정 if문 
            if (total > 100) {
                // 반복 종료
                break;
            }
        }
        // 결과 출력
        System.out.println("1 + 2 + ... + k 가 100을 넘는 최초의 k = " + k);
        System.out.println("(그때의 합 = " + total + ")");
    }
}