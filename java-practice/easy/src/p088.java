import java.util.Scanner;

public class p088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 시, 분, 초를 초로 변환
        // 1. 정수 입력
        // 2. 시, 분, 초를 초로 변환
        // 3. 결과 출력

        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        // 초 계산
        int total = h*3600 + m*60 + s;
        
        // 결과 출력
        System.out.println("총 " + total + "초");
    }
}

