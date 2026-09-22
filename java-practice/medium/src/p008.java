import java.util.Scanner;

public class p008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // BMI 판정
        // 1. 체중, 키 입력
        // 2. BMI 계산
        // 3. BMI 판정
        // 4. 결과 출력

        String result;  // 결과 변수 선언

        // 키, 체중 입력
        double heightCm = sc.nextDouble();
        double weightKg = sc.nextDouble();

        // BMI 계산
        double heightM = heightCm / 100;
        double bmi = weightKg / (heightM * heightM);

        // BMI 판정 if문
        // bmi 18.5 미만 -> 저체중
        if (bmi < 18.5) {
            result = "저체중";
            // bmi 23 미만 -> 정상
        } else if (bmi < 23) {
            result = "정상";
            // bmi 25 미만 -> 과체중
        } else if (bmi < 25) {
            result = "과체중";
            // bmi 25 이상 -> 비만
        } else {
            result = "비만";
        }

        // 결과 출력
        System.out.println("BMI: " + String.format("%.2f", bmi) + " → " + result);
    }
}