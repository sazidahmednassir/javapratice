package bd.sazid;


interface testint{
    int a = 50000000;
	void sa();
}

interface testbd{
    int b = 10000000;
	void sb();
}



public class InterfacePratice implements testint, testbd {
	public void sa() {
		System.out.println(a);
	}
	public void sb() {
		System.out.println(b);
	}
public static void main(String[] args) {
	
	InterfacePratice ip=new InterfacePratice();
	ip.sa();
	ip.sb();
	

}
}
