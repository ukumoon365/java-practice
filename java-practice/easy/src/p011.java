import java.util.Scanner;

public class p011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 월별 일수
        // 1. 월 입력
        // 2. 월별 30, 31, 28일 판별
        // 3. 결과 출력

        // 월 입력
        int month = sc.nextInt();

        // 일수를 기본값 "잘못된 월"로 초기화 / 그 외 값 예외 처리
        String countDay = "잘못된 월";

        // 일수 판별 switch문
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                countDay = "31일";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                countDay = "30일";
                break;
            case 2:
                countDay = "28일";
                break;
        }
        // 결과 출력
        System.out.println(countDay);


    }
}
