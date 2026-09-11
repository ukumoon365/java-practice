# Type Casting
```text
	큰 허용 범위를 작은 허용 범위 타입으로 쪼개어 강제 변환

✔️() 캐스팅 연산자
	- (): 캐스팅 연산자 
	괄호 안에 들어가는 타입은 쪼개는 단위
	
byte < short, char < int < long < float < double

✔️ int -> byte

	int intValue = 300;
	byte byteValue = (byte) intValue;
	
		○ (byte)를 캐스팅하여 byte 타입으로 강제 변환
	int 타입은 4byte 크기로 byte(1byte)로 변환 시 앞에 3byte는 삭제 
	-> 1byte의 값만 저장
	
✔️ long -> int
	
	long longValue = 3000;
	int intValue = (int) longValue;
	
		○ (int)를 캐스팅하여 int 타입으로 강제 변환
		long 타입은 8byte 크기로 int(4byte)로 변환 시 앞에 4byte는 삭제
		-> 4byte의 값만 저장
		
✔️ int -> char
	
	int intValue = 65;
	char charValue = (char) intValue;
	
		○ (char)를 캐스팅하여 char 타입으로 강제 변환
		char 타입의 허용 범위인 0 ~ 65535 사이의 값만 원래 값 유지 가능 
		/ 초과하는 값 강제 반환 시도 -> 2byte의 값만 남기고 앞 값은 삭제 -> 다른 유니코드 인식

✔️ 실수 -> 정수

	double doubleValue = 3.14;
	int intValue = (int) doubleValue;
	
		○ (int)를 캐스팅하여 int 타입으로 강제 변환
		소수점 이하의 숫자는 버려지고 정수 부분만 저장

```