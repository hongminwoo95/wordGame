package javawin01;

public class Day04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 산술 연산자는 + - * / %가 있고 예제는 다음과 같다
4+2   결과는 6
4/2   결과는 2
5%2   결과는 1
5%3   결과는 2

 문제 : 철수는 3개의 숫자의 평균을 구하려고 한다. (*변수는 적게 사용하세요)
 1. 철수가 87을 선택했다.
 2. 철수가 76을 선택했다.
 3. 철수가 69를 선택했다.
 4. 평균을 구한다.
 */
		int a=0;
		a=4+2;
		System.out.println("4+2="+a);
		int b=0;
		b=4/2;
		System.out.println("4/2="+b);
		int c=0;
		c=5%2;
		System.out.println("5%2="+c);
		int d=0;
		d=5%3;
		System.out.println("5%3="+d);
		int aa=87;
		int bb=76;
		int cc=69;
		int dd=0;
			dd=aa+bb+cc/3;
			System.out.println("철수가 "+aa+"을 선택햿다.");
			System.out.println("철수가 "+bb+"을 선택햿다.");
			System.out.println("철수가 "+cc+"을 선택햿다.");
		System.out.println("철수의 평균 = "+dd);
	}

}
