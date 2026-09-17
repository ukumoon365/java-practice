import java.util.Scanner;

public class p005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 장학금 대상 분류
        // 1. 점수 입력
        // 2. 점수에 따라 장학금 분류
        // 3. 결과 출력

        // 점수 입력
        int score = sc.nextInt();

        // 장학금 대상 분류 if문
        if (score >= 95) {
            System.out.println("전액 장학금");
        } else if (score >= 85) {
            System.out.println("반액 장학금");
        } else if (score >= 75) {
            System.out.println("기숙사 장학금");
        }
    }
}