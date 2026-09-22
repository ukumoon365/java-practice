# Loops
```text
✔️ for
정해진 횟수 만큼 반복

	for (초기화식; 조건식; 증감식) {
		실행 코드; (조건식 ture)
	}
	
	✅ 초기화식, 증감식이 두개 이상일 경우 ","로 구별 
	
⚠️ for의 초기화식의 변수는 for문 안에서만 사용 가능
⚠️ for문를 작성 시 초기화식에 부등소수점을 사용하는 float 타입 ❌
	연산 과정에서 0.1를 표현하지 못하기 때문
	
✔️ 중첩 for
	for (초기화식; 조건식1 ; 증감식) {
		(조건식 1이 ture) ⬇️
		for (초기화식; 조건식 2; 증감식) {   
			실행 코드; (조건식 2  ture)
		}
	}


✔️ while
조건식이 true일 경우 실행 / false일 경우 반복 종료

	while (조건식) {
		(조건식이 true) ⬇️
		실행 코드;
	} 
	(조건식 false) ⏹️

✔️ while true
	무한 반복
	boolean run = true  ✅ 변수 선언
	
	while (run) {
		실행 코드;
		if (조건식) {
			실행 코드;
		} else {
			run = false ✅ 반복 종료를 위한 변수 초기화
        } 


✔️ do-while
while과 동일하지만 do문안에 실행코드를 무조건 1회 실행 후 조건식에 따라 do문 안에 코드를 반복

	do {
		실행 코드; ( 최초 1회 무조건 실행 / 조건식 true)
	} while (조건식);
	(조건식 false) ⏹️
	
	⚠️ while (조건식) 뒤에 꼭 ";" 사용
```
# Control Statements
```text
✔️ break
	반복문 or switch문을 종료 할 때 사용
	주로 if 문과 같이 사용
	
	⚠️ 중첩 반복문의 break
		break 사용 시 해당 break문이 해당된 반복문만 종료됨
		✅ 내부 반복문에서 외부까지 반복 종료를 원한다면
			바깥 반복문에 이름을 붙이고 사용
			
			Label: for (....) {
				for (...) {
					break Label;
				}
			}
				
	
✔️ continue
	continue 밑의 실행 코드를 생략하고 다시 조건식으로 이동
주로 if문과 같이 사용
```