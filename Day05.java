package javawin01;

public class Day05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  ö���� ���а��θ� �ϰ� �ִ�. ���ڰ� 3234�ִٸ� 3+2+3+4�� ������� ���ϴ� �����̴�.
�� �ó������� �ڵ�� �ۼ��Ͽ�
���ڰ��� ���� ������� ���Ͻÿ�. 

1. ö���� ������ ���ڴ� 56773�̴�.  
2. ��� ������ ���� ���Ѵ�. 
 */
		int a=5;
		int b=6;
		int c=7;
		int d=7;
		int e=3;
		int aa=0;
		aa=a+b+c+d+e;
		System.out.println("ö���� ������ ���ڴ� "+a+b+c+d+e+"�̴�.");
		System.out.println("��� ������ ���� "+aa);
		
		int chulsunum=56773;
		int num5=chulsunum%10;
		int m1=chulsunum/10;
		int num4=m1%10;
		int m2=m1/10;
		int num3=m2%10;
		int m3=m2/10;
		int num2=m3%10;
		int num1=m3/10;
		System.out.println("ö���� ������ ���ڴ� "+num1+num2+num3+num4+num5);
		System.out.println(num1+num2+num3+num4+num5);
	}

}
