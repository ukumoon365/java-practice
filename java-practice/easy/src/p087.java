import java.util.Scanner;

public class p087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 초를 시, 분, 초로 변환
        // 1. 정수 입력
        // 2. 시, 분, 초 계산
        // 3. 결과 출력

        int total = sc.nextInt();

        // 시, 분, 초 계산
        int hour = total/3600;
        int rem = total%3600;
        int min = rem/60;
        int second = rem%60;

        // 결과 출력
        System.out.println(hour + "시간 " + min + "분 " + second + "초");
    }
}