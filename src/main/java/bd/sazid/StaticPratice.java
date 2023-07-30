package bd.sazid;

public class StaticPratice {
	
	int a;
	static int b;
	
	
	static void s1() {
		System.out.println("Hello");
		
	}
	
	
	void s2() {
		System.out.println("World!");
		
	}
	
	void s3() {
		a=200;
		b=300;
		System.out.println("Hello World!");
		s2();
	}
	
	public static void main(String[] args) {
		b=100;
		System.out.println(b);
		s1();
		
		StaticPratice st=new StaticPratice();
		st.a=100;
		
		System.out.println(st.a);
		st.s2();
		
		
	}

}
