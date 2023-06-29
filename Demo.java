public class Demo {
	public static void main(String args[]){
		byte bb[] = {65,66,67,68,69,70};
		String ss1 = new String(bb);
		System.out.println(ss1);
		
		String ss2 = new String(bb,2,3);
		System.out.println(ss2);

		char cc[] = {'A','B','C'};
		String ss3 = new String(cc);
		System.out.println(ss3);
	
		String ss4 = new String(cc,2,2);
		System.out.println(ss4);
		}
	}