package bd.sazid;

public class ForLoop {
	public static void main(String[] args) {
		
		for(int i=2;i<=20;i+=4) {
			System.out.println(i);
			
		}
		
		int b[]= new int[5];
		b[0]=20;
		b[1]=30;
		
		for(int i:b) {
			System.out.println(i);
		}
	}

}
