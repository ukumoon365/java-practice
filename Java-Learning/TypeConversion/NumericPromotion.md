# Numeric Promotion
```text
✔️ 정수 연산의 자동 변환
  ✅ 정수 리터럴 연산식
		○ 자바 컴파일러가 컴파일 단계에서 연산 후 변수에 저장함
	byte a = 10;
	byte b = 20;
		
	byte result = 10 + 20; 
	컴파일 단계에서 10 + 20 계산 -> 30의 값을 result에 저장하는 바이트 코드 생성

	- 피연산자가 변수인 연산식
		○ 실행시 연산을 수행
	⭐ int 타입보다 작은 byte, short는 ➡️ int로 자동 타입 변환
	byte a = 10;
	byte b = 20;
	
	❌ byte result=a+b;
	int result = a + b; ➡️ int a + int b -> int result ⭕
	✅ long 타입의 경우엔 변환없이 long으로 진행 -> long타입으로 변수 저장 

✔️ 실수 연산의 자동 변환
	- float, float의 연산식
		○ 타입 변환 없이 float 연산
		
	- float, double의 연산식
	⭐ float -> double로 자동 타입 변환
	float a = 0.5f;
	double b = 1.5;
	
	❌ float result = a + b;
	double result = a + b; ➡️ double a + double -> double result ⭕
	
	- int, double의 연산식
	⭐ int -> double로 자동 타입 변환
	int a = 1;
	double b = 1.5;
	
	double result = a + b; ➡️ double a + double b -> double result ⭕
	✅ int, float도 동일 / int -> float
	
	✅ int 강제 변환 연산 방법
	int a = 1;
	double b = 2;
	
	int result = a + (int) b; // 2
	➡️소수점 이하의 숫자는 버려진다
	
✔️ 문자(char) 연산
	- char, char의 연산식
	⭐ char -> int 자동 타입 변환
	char v1 = 'A';
	char v2 = 'B';
	
	❌char result = v1 + v2;
	int result = v1 + v2; ➡️ int a (65) + int b (66) -> int result ⭕

	char a = 'A';
	char b = 1;
	
	int result = a + b;
	
 ✔️⚠️ int 나누기 int
	1 / 2 = 0.5  
	but java에서는
	⭐ 정수의 연산 결과는 항상 정수
	int a = 1;
	int b = 2;
	
	double result = a / b; // 0.0
	
	
	➡️
	double a = 1;
	double b = 2;
	
	double result = a / b; // 0.5
	or
	int a = 1;
	int b = 2;
	
	double result = a / (double) b; / double result = (double) a / (double) b;

✔️ 문자열 연산
	- 피연산자 둘 중 하나라도 string(문자열) 일 경우
	⭐ string 타입으로 자동 변환
	String reuslt = "3" + 7; ➡️ string 3 + string 7 -> 37
```