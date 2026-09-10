# PrimitiveType
```text
기본 자료형 4가지 분류
✔️ 정수형 : bite, short, int, long
byte(1byte) / short(2byte) / int(4byte) / long(8byte)
○ 1byte의 범위: - 128 ~ + 127

	byte b =10;
	
	⚠️ byte result = b+1; or short result = b + 1; -> Error
			§ java에서 컴파일 과정에서 b(변수)가 무슨 값을 가지는 지 알 수 없음 🤷‍♂️ -> 최악의 상황 (범위가 맞지 않는 상황)을 가정 -> Error
			
	⭐ 산술 연사자 사용시는 int로 사용할 것 / int를 넘는 값이면 long 사용은 ⭕
		➡️ int result = b + 1; 
		○ 정수형은 산술 연산자(+, - *, / ...)를 사용 시 int 값으로 취급 (자동 변환)
	
	✅ long 타입은 수치가 큰 데이터를 다루는 프로그램에서 사용 
		○ ⚠️ 기본적으로 컴파일러는 정수 리터럴을 int로 인식
			⭐ 리터럴 뒤에 l or L로 명시 필요
				ex) long value = 10000000; ❌ / long value = 100000000L;

✔️실수형: float, double
⭐ java에서 기본 실수값 = double

	double d = 0.1;
		○ float은 double의 범위 반 (메모리 절약)
	float f = 0.1f;
	  ✅ float 사용 시 값 뒤에 f or F로 float임을 명시 필요

✔️문자형: char
문자 하나를 저장할 때 사용
✅ 문자 하나를 사용할 때는 ' '
char c = 'A ';

	char c2 = 65;
			§ char Type은 정수를 아스키 코드로 이해
			§ 아스키 코드: 영문 알파벳과 기초 기호를 고유한 숫자로 부여한 표준 표
			(아스키 코드는 8 bit / 1 byte -> 256개 but 7bit만 사용 중( 1bit는 오류 검출용 or 확장 아스키 (기호))
	char c2 = 65+1;
			§ 사칙 연산 가능 / 이름을 알파벳 순서대로 나열 or 다음 알파벳 순서 등등에 사용
	char c4 = '\u0041';
			§ Unicode (유니코드): 지구상의 모든 언어, 기호, 이모지까지 고유한 숫자(코드값)를 부여한 세계 표준 표
	
	⚠️ 초기화 목적으로 char word = ''; -> Error
		✅ 공백 (유니코드: 32)를 포함하여 초기화 
			ex) char word = ' ' or 32;

✔️boolean 형: true, false
true, false 값만 저장 가능 (소문자)
boolean boo = true;
```