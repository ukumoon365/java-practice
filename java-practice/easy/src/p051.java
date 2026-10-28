import java.util.Scanner;

public class p051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0에 가장 가까운 값
        // 1. 정수 입력
        // 2. n번 반복
        //      1) 정수 입력
        //      2) 절대값이 가장 작은 값 비교
        //          1. 가장 작은 절대값 갱신
        // 3. 결과 출력

        // 정수 입력
        int n = sc.nextInt();

        // 0에 가장 가까운 변수 초기화
        int smallest = sc.nextInt();

        // n번 반복 for문
        for (int i = 1; i < n; i++) {
            // 정수 입력
            int num = sc.nextInt();

            // 절대값 값 비교 if문
            if (Math.abs(num) < Math.abs(smallest)) {
                // 값 갱신
                smallest = num;
            }
        }

        // 결과 출력
        System.out.println("0에 가장 가까운 값: " + smallest);
    }
}
