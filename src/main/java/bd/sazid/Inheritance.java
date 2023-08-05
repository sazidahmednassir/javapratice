package bd.sazid;


class A{
	int a;
	int b;
	
	public void display() {
		System.out.println(a+b);
		
	}
	
}

class B extends A{
	int x;
	int y;
	public void show() {
		System.out.println(x+y);
		
	}
	
}

class C extends A{
	
    int z=1000;
    public void hello() {
		System.out.println("Hello World!");
	}
}

public class Inheritance {
	
		public static void main(String[] args) {
			
			A aj=new A();
			aj.a=100;
			aj.b=200;
			aj.display();
			
			B bj=new B();
			bj.x=400;
			bj.y=600;
			bj.show();
			
			bj.a=100;
			bj.b=200;
			bj.display();
			
			C cj=new C();
			
			cj.a=200000;
			cj.z=100000000;
			cj.hello();
			
		}
		
	
	
	

}
