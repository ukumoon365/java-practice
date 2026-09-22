import java.util.Scanner;

public class p009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 영어 달 이름
        // 1. 달 입력
        // 2. 해당 달의 영어 이름 판별 및 결과 출력

        // 달 입력
        int month = sc.nextInt();

        // 영어 달 이름 출력하는 switch
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default: // 범위 밖 값 입력 -> 예외 처리
                System.out.println("Invalid");
        }
    }
}
