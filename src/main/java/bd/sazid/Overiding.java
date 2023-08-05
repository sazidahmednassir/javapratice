package bd.sazid;


class Bank{
	
	int getvalue() {
		return 0;
	}
}



class sBank extends Bank{
	
	int getvalue() {
		return 100;
	}
}


class ICIC extends Bank{
	
	int getvalue() {
		return 300;
	}
}


public class Overiding {
	public static void main(String[] args) {
		sBank sBank=new sBank();
		System.out.println(sBank.getvalue());
		
		ICIC icBank=new ICIC();
		System.out.println(icBank.getvalue());
	}

}
