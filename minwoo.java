package javawin01;

import java.util.Random;
import java.util.Scanner;


public class minwoo {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in); // ������-> ���ڷḦ �ν����� ����
		//ctrl + shift + ���ĺ�o = ����Ʈ(�ʿ��� �ڷḦ ������) �ϴ� ����Ű
		
	//	Random r = new Random(); // ��Ʈ�� ����Ʈ o ���������
		// r.nextint <- �׽�Ʈ �ڵ�	
		/*	for(int i=0; i<10; i++) {
				System.out.println(r.nextInt(5)+1);
			}*/
		// �׽�Ʈ ��� �ζ� ��ȣ�� �����ϴ� �ڵ��
		// r.nextint(45)+1�� ������ �� �ִ�.
		
	//	int[] lotto =new int[7];
		//�迭 ���� Ȯ�� �׽�Ʈ �ڵ�
		/*for(int i=0; i<7;i++) {
		System.out.println(r.nextInt(i+"/"+lotto[i]); */
		
		// �ζ� ��ȣ�� �ϳ� �̾Ƽ� ������ ��������
		//int a = r.nextInt(45)+1;
		//�迭�� ��������
		//lotto[0]= a;
		// �̷��� �ݺ��Ǵ� �ڵ带 ã�Ƴ´�. ���� for������ ����
		//for(int i=0; i<7;i++) {
			//�ζ� ��ȣ�� �ϳ� �̾Ƽ� ������ ��������
		//	int b = r.nextInt(45)+1;
			//�迭�� ��������
		//	lotto[i]=b;
		//}
		//���� 18�� ���� ���� 24�� ���α����� �ּ�ó�� �Ѵ�.
		//���� �ζ� ��ȣ�� ����� ����
		//for(int i=0; i<7;i++) {
			//System.out.println(a.nextin(i+"/"+lotto[i]);
		
		/* Scanner in = new Scanner(System.in);
		String[] a= {"1.������ ","2.¥��� ","3.«�� ","4.�쵿 ","5.��� "};
		System.out.println("�޴��� �����ϼ��� ����� 999�Դϴ�");
		
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
				System.out.println("�޴��� �ִ� 3���� ���ð����մϴ�");
			}else if (sum>=3) {
				
			}else if (sum>=2) {
				
			}else if (sum==1) {
				
			}else {System.out.println("�޴��� ������ �ּ���");
		}
		}*/
		
				
		/*System.out.println("�̸��� �Է��ϼ���");
		String name = in.nextLine();
		System.out.println("����� �̸��� "+name);
		System.out.println("����� ���̸� �Է��ϼ���");
		int age = in.nextInt();
		System.out.println("����� ���̴� "+age);*/
		
		
		
		
		/* for(int i=0; i<3; i++) {
			System.out.println("ù��° ���ڸ� �Է�");
			System.out.println("�׸��ϰ� ������ 999");
			int a = in.nextInt();
			if(a==999) {
				break;
			}
			System.out.println("�ι�° ���� �Է�");
			int b = in.nextInt();
			System.out.println("A+B ="+(a+b));
		}*/
				
		
		/* int a = in.nextInt();
		System.out.println(a+"�� �Է��߾��");
		if (a%2==0){
			System.out.println("¦");
		}else {
			System.out.println("Ȧ");
		}*/
		
		
		// TODO Auto-generated method stub

	
	//char b = 'a';
//	System.out.println(b); ��� : a
	//System.out.println(b+2); ��� : 99
		//System.out.println((char)(b+2)); ��� : c
	//int a =(int)b-97;
	//System.out.println("���ϴ°�"+a);
	//	a=((a+2)%26)+97;
//	System.out.println("���ϴ°�"+(char)a);
			
		/*int a =70;
		if(a>=70){
		System.out.println("�հ�");}
		*/
		
		/*int a =80;
		if(a>=70) {
			System.out.println("�հ�");
		}else{
			System.out.println("���հ�");
			*/
		/*int a = 80;
		if(70<=a&&a<90){
		System.out.println("�հ�");}*/
		
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
			System.out.println("¦��");
		}else if (a%2!=0) {System.out.println("Ȧ��");}*/
		
		/* int[] lotto = {6,12,33,4,5,26};
		if (lotto[5]%2==0){
		System.out.println("¦��");;
		}else if (lotto[5]%2!=0)
		{System.out.println("Ȧ��");} */
		
		/*int[] lotto = {6,12,33,4,5,26};
		if (6%2!=0){
		} System.out.println("Ȧ��"); */
		
		
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
		System.out.println("����");}*/
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
			   //�ݺ��� �۾�
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
// �����ϳ��� ����, ū���� �����ϸ� ����Ѵ�.
		
    /*  int [] a= {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,0,0,0,0,0,3,3}; //���� 23
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
		System.out.println("���͸� ������ �����������մϴ�");
		s.nextLine();
		int point=0;
		int ppoint=0;
		for (int j=0; j<5; j++) {
			int num=r.nextInt(a.length); // a�迭 �ε�����ȣ
			System.out.println();
			System.out.println("������ �ܾ ����մϴ�");
			System.out.println(a[num]);
			System.out.println("���õ� �ܾ �Է��Ͻÿ�");
			String key=s.nextLine();
			if (key.equals("exit")) {
				System.out.println("������ �����մϴ�");
				break;
			}
			if(a[num].equals(key)) {
				point+=20;
				System.out.println("�����Դϴ� �ջ����� "+point+"�Դϴ�.");
			}else { // Ʋ���� �κ����� �ݿ�
				for (int i=0; i<a[num].length(); i++) {
					ppoint=0;
					if (a[num].charAt(i)==key.charAt(i)) {
						ppoint+=1;
						point+=ppoint;
						System.out.println((i+1)+"��° ���ĺ� �����Դϴ�. �κ����� "+ppoint+"��ŭ �������� �߰��˴ϴ�." );
					}
				}
			}
			System.out.println();
			System.out.println("��������="+point);
	}
		
		
	}	
}
				
			
			
		
	

	
	
