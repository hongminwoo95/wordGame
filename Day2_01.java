package javawin01;

import java.util.Random;

public class Day2_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	Random a=new Random();
		int[] lotto= new int[45];
		for(int i=0; i<1000; i++) {
			int b= a.nextInt(45)+1;
			lotto[b-1]++;
			
		}
		for (int i=0; i<45; i++) {
			System.out.println(i+1+"/"+lotto[i]+"/"+"È®·ü: "+(double)lotto[i]/1000*100);	
		}
		int number=0;
		int minnum=0;
		int max=0;
		int min=500;
		for(int i=0; i<45; i++) {
			if (max<=lotto[i]+1) {
				max=lotto[i]+1;
				number=i;
				//max=i;
			}
			
		} System.out.println(number+"/"+max);
		for(int i=0; i<45; i++) {
			if (min>=lotto[i]) {
				min=lotto[i];
				minnum=i+1;
			}
		}
		
		 System.out.println(minnum+"/"+min);
		//System.out.println(max+1); */
		
		Random r = new Random ();
		int a=r.nextInt(4);
		System.out.println(r.nextInt(2));
		
		for(int i=0; i<4; i++) {
			System.out.println(r.nextInt(4));
		}
	}
}		




