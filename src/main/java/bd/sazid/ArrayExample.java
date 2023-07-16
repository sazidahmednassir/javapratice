package bd.sazid;

import java.lang.invoke.StringConcatFactory;

public class ArrayExample {
    
	public static void main(String[] args){
		
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[3]=4;
		
		for(int i=0; i<=4; i++) {
			System.out.println(a[i]);
		}
		
		for(int i:a) {
			System.out.println(i);
		}
		
		String s[]=new String[5];
		s[0]="welcome";
		s[1]="sazid";
		
		System.out.println("ss"+s.length);
		
		
		for (String j:s) {
			System.out.println(j);
		}
		
		int sum=0;
		int as[]={100,200,300,400,500};
		
		for (int z:as) {
			System.out.println(z);
			sum=sum+z;
			
		}
		System.out.println(sum);
		
		Object b[]=new Object[5];
		
		b[0]=10;
		b[1]=20.98;
		b[2]="sazid";
		b[3]='S';
		b[4]=true;
		
		for (Object l:b) {
			System.out.println(l);
		}
		
		
		Object bs[]={100,20.09,"nassir","N",false};
		
		for (Object m:bs) {
			System.out.println(m);
		}
	}

}
