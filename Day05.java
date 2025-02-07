package javawin01;

public class Day05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  철수는 수학공부를 하고 있다. 숫자가 3234있다면 3+2+3+4의 결과값을 구하는 문제이다.
위 시나리오를 코드로 작성하여
숫자값에 따른 결과값을 구하시오. 

1. 철수가 선택한 숫자는 56773이다.  
2. 모든 숫자의 합을 구한다. 
 */
		int a=5;
		int b=6;
		int c=7;
		int d=7;
		int e=3;
		int aa=0;
		aa=a+b+c+d+e;
		System.out.println("철수가 선택한 숫자는 "+a+b+c+d+e+"이다.");
		System.out.println("모든 숫자의 합은 "+aa);
		
		int chulsunum=56773;
		int num5=chulsunum%10;
		int m1=chulsunum/10;
		int num4=m1%10;
		int m2=m1/10;
		int num3=m2%10;
		int m3=m2/10;
		int num2=m3%10;
		int num1=m3/10;
		System.out.println("철수가 선택한 숫자는 "+num1+num2+num3+num4+num5);
		System.out.println(num1+num2+num3+num4+num5);
	}

}
