package bd.sazid;

public class OOP {
	
	int empid=34;
	String empname;
	int salary;
	
	OOP(int id, String name, int sal){
		empid=id;
		empname=name;
		salary=sal;
				
	}
	
	
	void display(){
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
	}

	
	public static void main(String[] args) {
		
		OOP emp1=new OOP(3, "Nassir", 1000000);
		emp1.display();
		
		/*OOP op1=new OOP();
		op1.empid=2;
		op1.empname="Fahim";
		op1.salary=5000000;
		op1.display();
		
		OOP op2=new OOP();
		
		op2.empid=1;
		op2.empname="Sazid";
		op2.salary=7000000;
		op2.display();*/
		
	}
}
