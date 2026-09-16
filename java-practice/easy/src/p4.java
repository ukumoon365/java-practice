import java.util.Scanner;

public class p4 {
    public static void main (String[] args) {
        // 합격 / 불합격
        // 1. 점수 입력
        // if문을 사용하여 합격 여부 판별 및 출력
        Scanner sc = new Scanner(System.in);

        // 점수 입력
        int score = sc.nextInt();

        // 점수가 60점 이상이면 "합격" / 아니면 "불합격"
        if (score >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
    }
}
