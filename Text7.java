public class core java {
	static int call() {
		System.out.println("i am in the try block.");
		System.out.println(100/0);
		return 1;
		}catch(AritmeticException ae) {
			System.out.println("i am in the catch block.");
		return 2;
		}
		finally{
		System.out.println("i am in the finally block.");
		return 3;
		}
		}
	public static void main(String args[]) {
		int result = call();
		System.out.println("result is : "+result);
		}
	}

