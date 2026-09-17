import java.util.Scanner;

public class p006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 특정 월 안내
        // 1. 월 입력
        // 2. 특정 월에만 해당 메세지 출력

        // 달 입력
        int month = sc.nextInt();

        // 특정 달 판별 if문
        // 3월 -> "새 학기"
        if (month == 3) {
            System.out.println("새 학기");
            // 6월 -> "여름 방학"
        } else if (month == 6) {
            System.out.println("여름 방학");
            // 9월 -> "2학기"
        } else if (month == 9) {
            System.out.println("2학기");
            // 12월 -> 겨울 방학
        } else if (month == 12) {
            System.out.println("겨울 방학");
        }
    }
}