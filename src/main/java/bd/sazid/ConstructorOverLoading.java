/**
 * 
 */
package bd.sazid;

/**
 * 
 */
public class ConstructorOverLoading {
	
	int a=0;
	int b=0;
	double c=0;
	
	ConstructorOverLoading() {
		
		a=30;
		b=20;
		c=50;
	}
	
  ConstructorOverLoading(int a, int b) {
		this.a=a;
		this.b=b;
		
	}
  
  ConstructorOverLoading(int x, double y) {
		a=x;
		c=y;
		
	}
  
  ConstructorOverLoading(int x, int y, double z) {
		a=x;
		b=y;
		c=z;
		
	}

  void display() {
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
  }

	public static void main(String[] args) {
//		ConstructorOverLoading co=new ConstructorOverLoading(10, 20);
		ConstructorOverLoading co=new ConstructorOverLoading(10, 20.5);
		co.display();
		
	}
}
