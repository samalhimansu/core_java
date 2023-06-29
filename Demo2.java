import java.io.*;
public class Demo2 {
	public static void main(String args[]) {
		File ff = new File("f:/core14/io/a1.txt");
		if(ff.exists()){
			ff.delete();
			System.out.println("i delete the File.");
			}
		File aa = new File("f:/core14/io/Demo1.java");
		if(aa.exists()){
			aa.renameTo(new File("f:/core14/rashmi.java"));
			}
		}
	}