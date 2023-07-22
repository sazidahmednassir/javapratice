package bd.sazid;

public class StringMethods {
	public static void main(String[] args) {
		
		String s="Welcome";
		
		System.out.println(s.length());
		
		String s1="Sazid ";
		String s2="Ahmed Nassir";
		
		System.out.println(s1+" "+ s2);
		
		System.out.println(s1.concat(s2));
 		System.out.println("Welcome".concat(" Fahim"));
 		
 		String s3="WELCOME";
 		String s4="welcome";
 		System.out.println(s3.equals(s4));
 		System.out.println(s3.equalsIgnoreCase(s4));
 		
 		System.out.println(s3.contains(s4));
 		
 		System.out.println(s.substring(0, 5));
 		
 		System.out.println(s.replace('e', 'a'));
	}

}
