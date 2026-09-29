import java.util.Scanner;

public class p014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 할인 대상
        // 1. 멤버쉽 가입 여부, 금액 입력
        // 2. 할인 대상 판별
        // 3. 결과 출력

        // 멤버쉽, 금액 입력
        int isMember = sc.nextInt();
        int amount = sc.nextInt();

        // 결과 변수 선언
        String result;

        // 할인 대상 if문
        // 바깥 if문 회원 여부
        if (isMember == 1) {
            // 내부 if문 1만원 이상 여부
            if (amount >= 10000) {
                result = "10% 할인 대상";
            } else {
                result = "할인 대상 아님";
            }
        } else {
            result = "회원만 할인 가능";
        }

        // 결과 출력
        System.out.println(result);
    }
}

