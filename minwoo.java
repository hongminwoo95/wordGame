package javawin01;

import java.util.Random;
import java.util.Scanner;


public class minwoo {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in); // 빨간줄-> 그자료를 인식하지 못함
		//ctrl + shift + 알파벳o = 인폴트(필요한 자료를 가져옴) 하는 단축키
		
	//	Random r = new Random(); // 컨트롤 시프트 o 눌러줘야함
		// r.nextint <- 테스트 코드	
		/*	for(int i=0; i<10; i++) {
				System.out.println(r.nextInt(5)+1);
			}*/
		// 테스트 결과 로또 번호를 추출하는 코드는
		// r.nextint(45)+1로 결정할 수 있다.
		
	//	int[] lotto =new int[7];
		//배열 생성 확인 테스트 코드
		/*for(int i=0; i<7;i++) {
		System.out.println(r.nextInt(i+"/"+lotto[i]); */
		
		// 로또 번호를 하나 뽑아서 변수에 저장하자
		//int a = r.nextInt(45)+1;
		//배열에 저장하자
		//lotto[0]= a;
		// 이렇게 반복되는 코드를 찾아냈다. 이제 for문으로 변경
		//for(int i=0; i<7;i++) {
			//로또 번호를 하나 뽑아서 변수에 저장하자
		//	int b = r.nextInt(45)+1;
			//배열에 저장하자
		//	lotto[i]=b;
		//}
		//이제 18번 라인 부터 24번 라인까지는 주석처리 한다.
		//이제 로또 번호를 출력해 보자
		//for(int i=0; i<7;i++) {
			//System.out.println(a.nextin(i+"/"+lotto[i]);
		
		/* Scanner in = new Scanner(System.in);
		String[] a= {"1.군만두 ","2.짜장면 ","3.짬뽕 ","4.우동 ","5.돈까스 "};
		System.out.println("메뉴를 선택하세요 종료는 999입니다");
		
		for (int i=0; i<5; i++) {
			System.out.print(a[i]);
		} 
		
		int num1=in.nextInt();

		System.out.println(a[num1-1]);
		for (int u=0; u<5; u++) {
			int num=in.nextInt();
			int sum=0;
			num+=u;
			sum=num;
			if(sum==4) {
				System.out.println("메뉴는 최대 3개만 선택가능합니다");
			}else if (sum>=3) {
				
			}else if (sum>=2) {
				
			}else if (sum==1) {
				
			}else {System.out.println("메뉴를 선택해 주세요");
		}
		}*/
		
				
		/*System.out.println("이름을 입력하세요");
		String name = in.nextLine();
		System.out.println("당신의 이름은 "+name);
		System.out.println("당신의 나이를 입력하세요");
		int age = in.nextInt();
		System.out.println("당신의 나이는 "+age);*/
		
		
		
		
		/* for(int i=0; i<3; i++) {
			System.out.println("첫번째 숫자를 입력");
			System.out.println("그만하고 싶으면 999");
			int a = in.nextInt();
			if(a==999) {
				break;
			}
			System.out.println("두번째 숫자 입력");
			int b = in.nextInt();
			System.out.println("A+B ="+(a+b));
		}*/
				
		
		/* int a = in.nextInt();
		System.out.println(a+"를 입력했어요");
		if (a%2==0){
			System.out.println("짝");
		}else {
			System.out.println("홀");
		}*/
		
		
		// TODO Auto-generated method stub

	
	//char b = 'a';
//	System.out.println(b); 결과 : a
	//System.out.println(b+2); 결과 : 99
		//System.out.println((char)(b+2)); 결과 : c
	//int a =(int)b-97;
	//System.out.println("원하는값"+a);
	//	a=((a+2)%26)+97;
//	System.out.println("원하는값"+(char)a);
			
		/*int a =70;
		if(a>=70){
		System.out.println("합격");}
		*/
		
		/*int a =80;
		if(a>=70) {
			System.out.println("합격");
		}else{
			System.out.println("불합격");
			*/
		/*int a = 80;
		if(70<=a&&a<90){
		System.out.println("합격");}*/
		
		/* int a = 78;
		if(a>=90){
		System.out.println("a");
		}else if (80<=a&&a<90){
		System.out.println("b");
		}else if (70<=a&&a<80){
		System.out.println("c");
		}else if (60<=a&&a<70){
		System.out.println("d");
		}else{ System.out.println("f");} */
		
		/*int a = 34;
		if(a%2==0) {
			System.out.println("짝수");
		}else if (a%2!=0) {System.out.println("홀수");}*/
		
		/* int[] lotto = {6,12,33,4,5,26};
		if (lotto[5]%2==0){
		System.out.println("짝수");;
		}else if (lotto[5]%2!=0)
		{System.out.println("홀수");} */
		
		/*int[] lotto = {6,12,33,4,5,26};
		if (6%2!=0){
		} System.out.println("홀수"); */
		
		
		/*int[] lotto = {6,12,33,4,5,26};
		if (lotto[0]%2==0){}
		if (lotto[1]%2==0){}
		if (lotto[2]%2==0){}
		if (lotto[3]%2==0){}
		if (lotto[4]%2==0){}
		System.out.println(lotto[0]+"+"+lotto[1]+"+"+lotto[2]+"+"+lotto[3]+"+"+lotto[4]+"+"+lotto[5]+
				"="+(lotto[0]+lotto[1]+lotto[2]+lotto[3]+lotto[4]+lotto[5])); */
		/*int a = 70;
		int b = 59;
		if (a<b){
		System.out.println(b);
		}else if (a>b){
		System.out.println(a);
		}else if (a==b){
		System.out.println("같다");}*/
		/*int[] lotto = {6,12,33,4,5,26};
		
		if (lotto[3]>lotto[4]) {
		}else if (lotto[4]>lotto[0]) {
		}else if (lotto[0]>lotto[1]) {
		}else if (lotto[1]>lotto[5]) {
		}else if (lotto[5]>lotto[2]) {
		}
		}
		*/

		/* for (int i =1; i <=20; i++){
			   //반복할 작업
			    if (i%3==0){
System.out.println(i); 
		}
			} */
		/*  int point=70;
		 for(int i =1; i<=10; i++) {
			 point=point+10;
		 }System.out.println(point); */
		
		/* for(int i=100;i>=50;i--) {
			System.out.println(i); 	
		}*/
		
		/* int point =1000;
		for(int i =1; i<=30; i++){
				point+=1000;
		if(i%2==0){
		point+=500;==
				
		}System.out.println(point); 3*/
		/* for(int i=5; 5>=0; i--){
			System.out.println(i); */
		/* for(int i=0; i%2==0 || i < 10; i++){
			System.out.println(i); 
		}*/
		/*int sum=0;
		for(int i=0; i<5; i++){
			sum=sum+1;
		}
		System.out.println(sum);*/
		
		/* int a=0;
		for(int i=1; i<=100; i++){
			if(i%2==1){
				a=a+i;
			}
		}
		System.out.println(a); */
		/*int a =0;
		for(int i=1; i<=100; i++){
			if(i%2==0){
			a=a+i;
			}System.out.println(a); 
		} */
		
		/* int a=0;
	
		for(int i =100; i<=999; i++){
			if (100<=i&&i<=999){
				a=a+i;
		
			}
		}System.out.println(a);*/
		
	/* 	for (int i=100; i<=999; i++){
			if (i%100/10%3==0 && i%100%2==1)

			System.out.println(i); */
		
	
		/* System.out.print("abc");
		System.out.print("+");
		System.out.print("def"); */
	/*	int a=0;
		int h1=0;
		int h2=0;
		int h3=0;
		int h4=0;
		int j1=0;
		int j2=0;
		int j3=0;	
		int b=0;
		  for(int i=1;i < 8; i++){			 
			  a=a+i;
			  if (i<2 && a%2==1) {
				  h1=a;
			  		}		  
			  if (i<4 && a%2==1) {
				  h2=a;
			  		}
			  if (i<4 && a%2==0) {
				  j1=a;				
			  		}
			  if (i<5 && a%2==0) {
				  j2=a;				
			  		}
			  if (i<6 && a%2==1) {
				  h3=a;
			  		}
			  if (i<7 && a%2==1) {
				  h4=a;
			  		}	  
			  if (i<8 && a%2==0) {
				  j3=a;				
			  }
}
System.out.print(h1+"+");
System.out.print(h2+"+");
System.out.print(j1+"+");
System.out.print(j2+"+");
System.out.print(h3+"+");
System.out.print(h4+"+");
System.out.print(j3+"+");*/
// 변수하나를 지정, 큰값을 갱신하며 출력한다.
		
    /*  int [] a= {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,0,0,0,0,0,3,3}; //길이 23
     	int b=-1;
     	int cnt=1;
     	int max=-1;
     	int ta=-1;
     for(int i=0; i<23; i++) { //  
     			if (b!=a[i]) { // 
     				b=a[i]; cnt=1;
     			}else {
     				cnt++;
     			}
     			if(cnt>max) {
     				max=cnt;
     				ta=a[i];
     			}
     			
     		}System.out.println(max+"/"+ta); */
		
		String[] a = {"apple", "banana", "plum", "pear", "orange", "grape", "peach", "lychee", "guava", "lemon"};
		Scanner s=new Scanner(System.in);
		Random r = new Random();
		System.out.println("엔터를 누르면 게임을시작합니다");
		s.nextLine();
		int point=0;
		int ppoint=0;
		for (int j=0; j<5; j++) {
			int num=r.nextInt(a.length); // a배열 인덱스번호
			System.out.println();
			System.out.println("랜덤한 단어를 출력합니다");
			System.out.println(a[num]);
			System.out.println("제시된 단어를 입력하시오");
			String key=s.nextLine();
			if (key.equals("exit")) {
				System.out.println("게임을 종료합니다");
				break;
			}
			if(a[num].equals(key)) {
				point+=20;
				System.out.println("정답입니다 합산점수 "+point+"입니다.");
			}else { // 틀릴시 부분점수 반영
				for (int i=0; i<a[num].length(); i++) {
					ppoint=0;
					if (a[num].charAt(i)==key.charAt(i)) {
						ppoint+=1;
						point+=ppoint;
						System.out.println((i+1)+"번째 알파벳 정답입니다. 부분점수 "+ppoint+"만큼 총점수에 추가됩니다." );
					}
				}
			}
			System.out.println();
			System.out.println("총점수는="+point);
	}
		
		
	}	
}
				
			
			
		
	

	
	
