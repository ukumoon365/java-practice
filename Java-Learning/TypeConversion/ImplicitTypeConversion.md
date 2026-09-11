# Implicit Type Conversion
```text
	자동으로 값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 변환
	
✔️ 허용 범위 순
	byte < short, char < int < long < float < double
	
	byte a = 10;
	int b = a;
		○ b는 byte 10이 아닌 int 10으로 자동 변환
	원본 값을 복사하여 int로 자동변환 후 b 메모리에 저장
	
✔️ 정수 타입 -> 실수 타입
	정수 타입이 실수 타입으로 대입될 경우 ⭐자동 변환이 일어난다.
	(실수 타입 > 정수 타입)
	
	long a = 5000000000L;
	float b = a;
	double c = a;
		○ b는 5.0E9f / c는 5.0E9 로 자동 변환 후 저장 (E9는 10의 9제곱을 의미)

✔️char 타입 -> int 타입
	char 타입이 int 타입으로 변환 시 유니코드 값이 int 타입에 대입
	 
	char a = 'A';
	int b = a;
		○ b는 A의 유니 코드 65로 저장
	⚠️ char보다 작은 byte 타입은 char 타입으로 자동변환 될 수 없다
		(char 타입의 허용 범위는 음수❌ but byte 타입은 음수⭕)
	
	byte a = 65;
	char b = a;
-> 컴파일 Error
```