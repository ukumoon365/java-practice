import java.util.Scanner;

public class p010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 요일 한국어 / 영어
        // 1. 요일 번호 입력
        // 2. 해당 번호 요일의 한국어, 영어 이름 판별
        // 3. 결과 출력

        // 일 입력
        int day = sc.nextInt();
        // 요일 문자열 변수 초기화
        String strDay = "";
        // switch 문을 사용하여 입력값에 맞게 요일 변수 수정
        switch (day) {
            case 1:
                strDay = "월요일 / Monday";
                break;
            case 2:
                strDay = "화요일 / Tuesday";
                break;
            case 3:
                strDay = "수요일 / Wednesday";
                break;
            case 4:
                strDay = "목요일 / Thursday";
                break;
            case 5:
                strDay = "금요일 / Friday";
                break;
            case 6:
                strDay = "토요일 / Saturday";
                break;
            case 7:
                strDay = "일요일 / Sunday";
                break;
            default: // 1~7 외에 값 예외 처리
                strDay = "잘못된 입력";
                break;
        }
        // 결과 출력
        System.out.println(strDay);
    }
}