import java.util.Scanner;

public class p012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 평일 / 주말
        // 1. 요일 번호 입력
        // 2. 평일, 주말 판별
        // 3. 결과 출력

        // 요일 번호 입력
        int day = sc.nextInt();

        // 결과값 "잘못된 입력"으로 초기화
        String dayResult = "잘못된 입력";

        // 평일, 주말 구분 switch문
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayResult = "평일";
                break;
            case 6:
            case 7:
                dayResult = "주말";
                break;
            default:

        }
        // 결과 출력
        System.out.println(dayResult);

    }
}

