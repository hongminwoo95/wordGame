package javawin01;

import java.util.Random;
import java.util.Scanner;

// Ŭ������ - Ŭ���� ���ο��� �޼��尡 �ִ�
public class Day2_02 {
						//�޼����(�Ű�����)= �����
	public static void main(String[] args) {
		// �迭 Ư¡ : ���������� �Ҵ�, �������� 
		// ����������, ����(�ε���), value�� ���� �м��Ѵ�.
		//int[] a = new int[4];
		//System.out.println("���� : "+a.length);
		//System.out.println("�ʱⰪ: "+a[0]);
	//	a[0]=40;
	//	a[3]=60;
		//System.out.println(a[0]+"/"+a[1]+"/"+a[2]+"/"+a[3]);
		//�迭�� �ε��� ������ ����� ���� �߻�
     //    a[4]=70;


		
/*	String[] menu = {"¥���","����","�쵿","�ѽ�"};
	System.out.println("������ �޴�");
		System.out.println(menu[0]);
		System.out.println(menu[1]);
		System.out.println(menu[2]);
		System.out.println(menu[3]);
		menu[2]="���";
		System.out.println();
		System.out.print();
		System.out.print();
		System.out.print();
		System.out.print();*/
		
		/* String[] a = new String[3];
		a[0]="����";
		a[1]="����";
		a[2]="����";
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
				name[1]="ȫ�浿";
				System.out.println(name[1]+"��"); */
		
		/* int carnum = 3456;
		int[] ccnum= new int[10];
		ccnum[0]=3;
		ccnum[1]=4;
		ccnum[2]=5;
		ccnum[3]=6;
		int ccc = ccnum[0]+ccnum[1]+ccnum[2]+ccnum[3];
System.out.println(carnum+"�� ���� ��ȣ�� "+ccc+"�Դϴ�."); */
		
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
		System.out.println("������ �Է��Ͻÿ�");
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
			System.out.println("����1");
		}
		String aa = new String("kim");
		String bb = new String("kim");
		
		System.out.println(aa.length()+"<"); //---> ���ڿ� ���������� �Ѽ�����
		System.out.println(aa.indexOf("im")+"<<"); //---> ���ڿ��� ã�ƴ޶� ������ ����
		if (aa==bb) { //----> �׸��� �ٸ��� ������ ����
			System.out.println("����2");
		}
		if (aa.equals(bb)) { //------> �׸��� �������
			System.out.println("����3");
		}*/
		
		/*Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("�̸��� �Է��ϼ���");
			String name = in.nextLine();
			System.out.println("�Է��Ͻ� �̸��� "+name);
			System.out.println("�Է��Ͻ� �̸��� ���̴�"+name.length());
			System.out.println("���̸� �Է��ϼ���");
			int age = in.nextInt();
			in.nextLine();
			System.out.println("�Է��Ͻ� ���̴�"+age);
			System.out.println("��̸� �Է��ϼ���");
			String hobby = in.nextLine();
			System.out.println("��̷�"+hobby+"�� �Է��ϼ̽��ϴ�.");
			
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
		System.out.println("�̸��� �Է��Ͻÿ�");
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
			System.out.println("���̵� �Է����ּ���");
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
			System.out.println("�Է��� id "+id+" �� �ش�Ǵ� Ư�������� ������"+sum+"�� �Դϴ�");
		}*/
		/*Scanner s = new Scanner(System.in);
		Random r= new Random();
		String[] id= {"grape", "melon", "banana", "Lemon", "Lime", "orange", "cherry",
				"mango", "papaya", "peach"};
		System.out.println("EnterŰ�� �����ø� ������ ���۵˴ϴ�");
		s.nextLine();
		int point=0;
		for(int i=0; i<10; i++) {
			System.out.println("������ ����մϴ�");
			char nn=id[i].charAt(id[i].length()-1); // id[i].length()�� 
			String id2=r.nextInt(id[i].length);
			System.out.println(id2);
			System.out.println("��µ� �ܾ ���󾲽ÿ�");
			String aa=s.nextLine();
			char nn1=aa.charAt(aa.length()-1);
				if(nn==nn1){
					System.out.println("�����Դϴ�! +10�� �帳�ϴ�");
					point+=10;
				}
			System.out.println("������"+point);
		}
		*/
		/*Scanner s = new Scanner(System.in);
		Random r = new Random();
		String[] a= {"apple","banana","cherry","kiwi","lemon","mango","pear","plum","tomato","egg"};
		System.out.println("����Ű�� ������ ������ �����մϴ�");
		String qq=s.nextLine();
		int point=0;
		int c=0;
		for(int i=0; i<10; i++) {
			String[] b=new String[r.nextInt(a.length)]; // b�� ��Ʈ������ int�� ������ ���� a�� �ִ°��� �����ͼ� b�� �ִ´�.
				b[i]=a[i];
				System.out.println(b[i]);
				System.out.println("�Էµ� ������ ���� �ۼ��Ͻÿ�");
			if (a[i].equals(b[i])) {
					point+=10;
					System.out.println("�����Դϴ� 10����Ʈ �߰��˴�");
			for (int j=0; j<a[i].length(); j++) {
				int ppoint=ppoint+1;
				point++;
				System.out.println("�κ�����"+ ppoint+"�� �������� �ջ�˴ϴ�.  ������="+point);

				

				

			

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
			

		
			
	
	





