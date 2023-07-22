package bd.sazid;

public class EachLoop {
	public static void main(String[] args) {
		
		int a[][]= {{10, 20, 30}, {20, 30, 40}, {50, 60, 70}};
		
		
		for(int i[]:a) {
			for(int j:i) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
