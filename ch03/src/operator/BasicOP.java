package operator;

public class BasicOP {
	
	public static void main(String[] args) {
		
		int day, remainder;
		day = remainder = 365;
		int week = 365 / 7; // 정수/정수 결과는 정수
		
		System.out.format("1년은 %d일이며 %d주이다. %n", day, week);
		System.out.println(remainder %= 7);
		
		System.out.println(remainder);
		
	}

}


/* 대입 연산자
* 
* 연산자        의미
* =          연산자를 중심으로 오른쪽 변수값을 왼쪽 변수에 대입한다.
* +=         왼쪽 변수에 더하면서 대입한다.
* -=         왼쪽 변수값에서 빼면서 대입한다.
* *=         왼쪽 변수에 곱하면서 대입한다.
* /=         왼쪽 변수에 나누면서 대입한다.
* %=         왼쪽 변수에 나머지 값을 구하면서 대입한다.

* 증감 연산자
 * 연산자            의미
 * ++            1씩 증가시킨다.
 * --            1씩 감소시킨다.

* 조건 연산자(삼항 연산자)
 * 연산자           의미                                  구성
 * ?:            제어문의 단일 비교문과 유사하다.    제어문의 단일 비교문과 유사하다.
 *

*/



