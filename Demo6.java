import java.io.*;
public class Demo6 {
	public static void main(String args[]) {
		File ff = new File("f:/core14/io/Demo6.java");
		System.out.println("File name is : "+ff.getName());
		System.out.println("File path is : "+ff.getPath());
		System.out.println("Parent working directory is : "+ff.getParent());
		System.out.println("Read Permission : "+ff.canRead());
		System.out.println("Write Permission : "+ff.canWrite());
		System.out.println("Execute Permisson : "+ff.canExecute());
		System.out.println("Hidden File : "+ff.isDirectory());
		System.out.println("File : "+ff.isFile());
		System.out.println("Directory : "+ff.isDirectory());
		System.out.println("Free spaces : "+ff.getFreeSpace());
		System.out.println("Length is : "+ff.length());
		File aa = new File("f:/core14/io/a1.txt");
		if(!aa.exists()){
			try{
			aa.createNewFile();
			}catch(Exception ee){
				}
			}
		}
	}