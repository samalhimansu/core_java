public class Equals{
	public static void main(String args[]){
		String s1 = new String("hello");
		String s2 = "hello";
		String s3 = "Hello";
		String s4 = "hello";
		String s5 = "Hello";
		String s6 = new String("hello");
		if(s1 == s2){
			System.out.println("True");
			} else {
			System.out.println("False");
			}
		if(s2 == s3){
			System.out.println("True");
			} else {
			System.out.println("False");
			}
		if(s2 == s4){
			System.out.println("True");
			} else {
			System.out.println("False");
			}
		if(s3 == s5){
			System.out.println("True");
			} else {
			System.out.println("False");
			}
		if(s1 == s6){
			System.out.println("True");
			} else {
			System.out.println("Flase");
			}
		}
	}
		
	