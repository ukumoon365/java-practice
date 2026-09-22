import java.util.Scanner;

public class p007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 계절 판별
        // 1. 달 입력
        // 2. 계절 판별하여 계절 출력

        // 달 입력
        int month = sc.nextInt();

        // 계절 판별 if문
        // 3, 4, 5월 -> 봄
        if (month == 3 || month == 4 || month == 5){
            System.out.println("봄");
            // 6, 7, 8월 -> 여름
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("여름");
            // 9, 10, 11월 -> 가을
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("가을");
            // 12, 1, 2월 -> 겨울
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("겨울");
            // 그 외 입력 -> 잘못된 월
        } else {
            System.out.println("잘못된 월");
        }
    }
}