import java.io.*;
public class Demo3{
	public static void main(String args[]){
		File ff = new File("f:/core14/exception");
		String name[] = ff.list();
		for(String fname : name) {
			System.out.println(fname);
			}
		}
	}