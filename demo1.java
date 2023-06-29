public class demo1 {
	static int arr[];
	public static void main(String args[])
		{
		arr = new int[]{35,45,87,234,99};
		System.out.println("\nRetrive the arry elements.\n");
		for(int x : arr){
			System.out.println(x);
			}
		}
	}