package javawin01;

public class Day02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//영수와 철수는 게임을 한다. 게임은 가위바위보를 해서
		//이기면 +10점, 지면 -10점 비기면 +2점이다. 다음 시나리오를 코드로 작성하시오
		//변수와 연산자로 1~5번 사용 코드 작성
		
		//1. 영수와 철수는 각각 기본점수 100점이다.
		// 변수를 만드는것은 선언문이라 한다. 
		int 영수=100; //int 영수=100;전체는 선언문 int(자료형) 영수(변수) 100(변수값)
	    int 철수=100;
		//철수가 2번 연속 이겼다.
		영수=영수-10;
		영수=영수-10;
		철수=철수+10;
		철수=철수+10;
		//비겼다
		영수=영수+2; // 변수+상수 변수,상수 모두 int형 = 사칙연산
		철수=철수+2;
		//영수가 한번 이겼다
		영수=영수+10;
	    철수=철수-10;
		//최종점수를 출력하시오
	    
	    // 변수는 한글로쓰면 x 영어로 써야함
	    
		System.out.println("영수의점수 : "+영수);  //문자+변수 = 사칙연산이 아님x
		System.out.println("철수의점수 : "+철수);   //실행 컨트롤+f11  , // sysout+컨트롤,스페이스 누르면 자동으로 완성

	}

}
