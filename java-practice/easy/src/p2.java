import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // 18세 이상일 경우 문자열 출력
        if (age >= 18){
            System.out.print("성인입니다");
        }
    }
}
