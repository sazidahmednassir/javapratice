package bd.sazid;

public class Employee {

	int a;
	int b;
	
	
	int sum() {
		return(a+b);
	}
	
	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.a=50;
		emp.b=70;
		System.out.println(emp.sum());
	}
}
