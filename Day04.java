package javawin01;

public class Day04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 ��� �����ڴ� + - * / %�� �ְ� ������ ������ ����
4+2   ����� 6
4/2   ����� 2
5%2   ����� 1
5%3   ����� 2

 ���� : ö���� 3���� ������ ����� ���Ϸ��� �Ѵ�. (*������ ���� ����ϼ���)
 1. ö���� 87�� �����ߴ�.
 2. ö���� 76�� �����ߴ�.
 3. ö���� 69�� �����ߴ�.
 4. ����� ���Ѵ�.
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
			System.out.println("ö���� "+aa+"�� ��������.");
			System.out.println("ö���� "+bb+"�� ��������.");
			System.out.println("ö���� "+cc+"�� ��������.");
		System.out.println("ö���� ��� = "+dd);
	}

}
