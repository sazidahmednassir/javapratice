package bd.sazid;

public class MethodOverloading {
	
	int a;
	int b;
	
	void sum() {
		a=50;
		b=50;
		System.out.println(a+b);
	}
	
	void sum(int x, int y) {
		int a=x;
		int b=y;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		MethodOverloading mol=new MethodOverloading();
		mol.sum();
		mol.sum(590, 890);
		
	}

}
