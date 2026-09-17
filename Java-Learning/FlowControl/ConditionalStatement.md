#  Conditional Statement
```text
✔️ if
조건식 결과에 따라 실행

if (조건식) {
    실행 코드 (조건식 true)
};
조건식 false일 시 실행 ❌
✅ {} 내에 실행문이 하나만 있다면 {} 생략 가능 (but 추천하진 않음)

✔️ if / else
if (조건식) {
    실행 코드; (조건식 true)
} else {
    실행 코드; (조건식 false)
};

✔️ if / else if / else
if (조건식 1 ) {
    실행 코드; (조건식 1 true)
} else if (조건식 2) {
    실행 코드; (조건식 2 true)
} else {
    실행 코드; (모든 조건식 false)
};


✔️ 중첩 if문
if (조건식 1 ) {
    (조건식 1 true) ⬇️
    if (조건식 2 ) {
        실행 코드; (조건식 2 true)
    } else {
        실행 코드; (조건식 2 false)
    };
} else {
    실행 코드; (조건식 1 false) 
};
```
```text
✔️switch
변수 값에 따라서 실행

switch(변수) {
    case 값 1:
        실행 코드; (값이 1일 경우)
        break;
    case 값 2:
        실행 코드; (값이 2일 경우)
    break;
        ・
        ・
        ・
    default: (값이 모두 아닐 경우) ✅ 생략 가능
        실행 코드;
}

⚠️ break가 없을 경우
해당 값의 실행코드를 실행 후 값과 상관없이 다음 case의 코드가 실행됨
    fall-through를 의도 했다면 break 생략

✅ 변수 값으로는 정수타입, 문자열 타입 변수를 사용할 수 있다
✅ 영어 대소문자 상관 없이 똑같이 처리하기 위해선
case 'A':
case 'a':
    실행 코드;
    break;
위와 같이 두가지 모두 case로 적어야한다

✔️ switch expressions
(java 12부터 지원)
switch (변수) {
    case 값 -> {
        실행 코드;
    }
}

✅ -> {} 사용으로 break; 없이 사용
✅ 실행 코드가 하나만 있을 경우 {} 생략 가능
	case 값 -> 실행 코드;

✔️ 스위치된 값을 변수에 바로 대입
	1) java 11 이전 
	    String grade = "A";
		
	    int score = 0;
		
	    switch (grade) {
		    case "A":
		        score = 100;
		        break;
		    case"B":
		        int result = 100 - 20;
		        score = result;
		        break;
		    default:
		        score=60;
		}
		
		2) java 13 이후
		String grade="A";
		
		int score = switch (grade) {
		        case"A"->100;
			    case"B"->{
			        int result = 100 - 20;
			        yield result;
			}
			default->60;
		};
⚠️ default 값이 반드시 존재 해야한다
```