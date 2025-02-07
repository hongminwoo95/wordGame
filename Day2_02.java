package javawin01;

import java.util.Random;
import java.util.Scanner;

// 클래스명 - 클래스 내부에는 메서드가 있다
public class Day2_02 {
						//메서드명(매개변수)= 용어기억
	public static void main(String[] args) {
		// 배열 특징 : 연속적으로 할당, 고정길이 
		// 참조변수명, 길이(인덱스), value를 먼저 분석한다.
		//int[] a = new int[4];
		//System.out.println("길이 : "+a.length);
		//System.out.println("초기값: "+a[0]);
	//	a[0]=40;
	//	a[3]=60;
		//System.out.println(a[0]+"/"+a[1]+"/"+a[2]+"/"+a[3]);
		//배열의 인덱스 범위가 벗어나면 예외 발생
     //    a[4]=70;


		
/*	String[] menu = {"짜장면","국수","우동","한식"};
	System.out.println("오늘의 메뉴");
		System.out.println(menu[0]);
		System.out.println(menu[1]);
		System.out.println(menu[2]);
		System.out.println(menu[3]);
		menu[2]="돈까스";
		System.out.println();
		System.out.print();
		System.out.print();
		System.out.print();
		System.out.print();*/
		
		/* String[] a = new String[3];
		a[0]="영어";
		a[1]="수학";
		a[2]="과학";
		System.out.println(a[0]+","+a[1]+","+a[2]); */
		
				
		/* int[] a = new int[100];
		a[0]=45;
		a[1]=75;
		a[2]=60;
		a[3]=70;
		a[4]=30;
		System.out.println((double)(a[0]+a[1]+a[2]+a[3]+a[4])/5); */
		
	    /* int[] point = new int[1];
		point[0]=80;
		System.out.println(point[0]); */
		
		/* int[] num = new int[2];
				num[0]=10;
				num[1]=4;
				System.out.println((double)num[0]%num[1]); */
		
		/* String[] name = new String[2];
				name[0]="";
				name[1]="홍길동";
				System.out.println(name[1]+"님"); */
		
		/* int carnum = 3456;
		int[] ccnum= new int[10];
		ccnum[0]=3;
		ccnum[1]=4;
		ccnum[2]=5;
		ccnum[3]=6;
		int ccc = ccnum[0]+ccnum[1]+ccnum[2]+ccnum[3];
System.out.println(carnum+"의 주차 번호는 "+ccc+"입니다."); */
		
		/* int[] lotto = {6,12,33,4,5,26};
		int num=lotto[2]+80;
		System.out.println(num); */
		
	/*	byte[] buffers = {97, 49, 98, 50, 99, 51}; 
		System.out.println((char)buffers[0]+","+(char)buffers[1]+","+
		(char)buffers[2]+","+(char)buffers[3]+","+(char)buffers[4]+","+(char)buffers[5]);*/
		
		
		/*int[] lotto = {6,12,33,4,5,26};
		if (lotto[0]%2==0){}
		if (lotto[1]%2==0){}
		if (lotto[2]%2==0){}
		if (lotto[3]%2==0){}
		if (lotto[4]%2==0){}
		System.out.println(lotto[0]+lotto[1]+lotto[2]+lotto[3]+lotto[4]+lotto[5]);*/
		
		/*int a=20;
		for(int i=0; i<5; i++)*/
	
		/* int a=0;
		for(int i=1; i<=100; i++){
		if(i%2==1){
		a=a+i;
		System.out.println(a);
		}}*/ 
		// int num=0;
		// System.out.println(r.nextInt(45));
		
		/*Scanner a = new Scanner(System.in);
		String[] train = new String[5];
		System.out.println("기차를 입력하시오");
		for (int i=0; i<5; i++) {
			String name=a.nextLine();
			train[i]=name;
		}
		for (int i=0; i<5; i++) {
			System.out.println(train[i]);
		}*/
		
		/*Random r= new Random();
		int[] a=new int[4];
		int b=0;
		for (int i=0; i<4; i++) {
			b=r.nextInt(4);
			a[i]=b;
			System.out.println(a[b]);
		}*/
		
		/*int a=10;
		int b=10;
		if(a==b) {
			System.out.println("같다1");
		}
		String aa = new String("kim");
		String bb = new String("kim");
		
		System.out.println(aa.length()+"<"); //---> 문자열 갯수제한을 둘수있음
		System.out.println(aa.indexOf("im")+"<<"); //---> 문자열을 찾아달라 갯수가 나옴
		if (aa==bb) { //----> 그릇은 다르고 내용은 같다
			System.out.println("같다2");
		}
		if (aa.equals(bb)) { //------> 그릇이 같은경우
			System.out.println("같다3");
		}*/
		
		/*Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("이름을 입력하세요");
			String name = in.nextLine();
			System.out.println("입력하신 이름은 "+name);
			System.out.println("입력하신 이름의 길이는"+name.length());
			System.out.println("나이를 입력하세요");
			int age = in.nextInt();
			in.nextLine();
			System.out.println("입력하신 나이는"+age);
			System.out.println("취미를 입력하세요");
			String hobby = in.nextLine();
			System.out.println("취미로"+hobby+"을 입력하셨습니다.");
			
		}*/
		//(aa.equals(bb))
		
		/*Scanner a=new Scanner(System.in);
		String[] id=new String[3];
		String c=new String("@");
		for (int i=0; i<3; i++) {
			id[i]=a.nextLine();
			System.out.println(id[i]);
			
			for (int j=0; j<10; j++) {
	
			}
			if(id[i].equals(c)) {
				cnt++;
			}
		}System.out.println(cnt); */
		
		
		/*Scanner a=new Scanner(System.in);
		String id=a.nextLine(); */
		
		/*char cc = '@';
		int num=0;
		Scanner a=new Scanner(System.in);
		System.out.println("이름을 입력하시오");
		for (int i=0; i<3; i++) {
			String b=a.nextLine();
			System.out.println(b);
			for (int j=0; j<b.length(); j++) {
				if (b.charAt(j)==cc) {
					num++;
				}
			}
		}System.out.println(num);*/
		
		/*int sum=0;
		Scanner s=new Scanner(System.in);
		String sign="!@#$%^&";
		while(true) {
			System.out.println("아이디를 입력해주세요");
			String id=s.nextLine();
			for(int i=0; i<id.length(); i++) {
				char a=id.charAt(i);
					for(int j=0; j<7; j++) {
						char b=sign.charAt(j);
						if(a==b) {
						sum++;
						}
					}
			}
			System.out.println("입력한 id "+id+" 에 해당되는 특수문자의 개수는"+sum+"개 입니다");
		}*/
		/*Scanner s = new Scanner(System.in);
		Random r= new Random();
		String[] id= {"grape", "melon", "banana", "Lemon", "Lime", "orange", "cherry",
				"mango", "papaya", "peach"};
		System.out.println("Enter키를 누르시면 게임이 시작됩니다");
		s.nextLine();
		int point=0;
		for(int i=0; i<10; i++) {
			System.out.println("문제를 출력합니다");
			char nn=id[i].charAt(id[i].length()-1); // id[i].length()는 
			String id2=r.nextInt(id[i].length);
			System.out.println(id2);
			System.out.println("출력된 단어를 따라쓰시오");
			String aa=s.nextLine();
			char nn1=aa.charAt(aa.length()-1);
				if(nn==nn1){
					System.out.println("정답입니다! +10점 드립니다");
					point+=10;
				}
			System.out.println("점수는"+point);
		}
		*/
		/*Scanner s = new Scanner(System.in);
		Random r = new Random();
		String[] a= {"apple","banana","cherry","kiwi","lemon","mango","pear","plum","tomato","egg"};
		System.out.println("엔터키를 누르면 게임을 시작합니다");
		String qq=s.nextLine();
		int point=0;
		int c=0;
		for(int i=0; i<10; i++) {
			String[] b=new String[r.nextInt(a.length)]; // b는 스트링에는 int를 넣을수 없음 a에 있는값을 가져와서 b다 넣는다.
				b[i]=a[i];
				System.out.println(b[i]);
				System.out.println("입력된 예문을 따라 작성하시오");
			if (a[i].equals(b[i])) {
					point+=10;
					System.out.println("정답입니다 10포인트 추가됩니");
			for (int j=0; j<a[i].length(); j++) {
				int ppoint=ppoint+1;
				point++;
				System.out.println("부분점수"+ ppoint+"가 총점수에 합산됩니다.  총점수="+point);

				

				

			

			}

		}
	
		
		*/
		String[] id= {"grape", "melon", "banana", "Lemon", "Lime", "orange", "cherry",
				"mango", "papaya", "peach"};
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		int num=r.nextInt()
		
}
}
			

		
			
	
	





