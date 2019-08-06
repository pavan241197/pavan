package Capgemini_io;
import java.util.Date;
import java.io.File;


public class Test_File {
	public static void main (String[] args) {
		File file;
		file= new File("C:\\CAPGEMINI\\ReadMe.txt ");
		System.out.println("exists:"+file.exists());
		System.out.println("file:"+file.isFile());
		System.out.println("directory :"+file.isDirectory());
		System.out.println("length:"+file.length());
		System.out.println("canRead:"+file.canRead());
		System.out.println("canWrite:"+file.canWrite());
		System.out.println("can execute:"+file.canExecute());
		System.out.println("path:"+file.getPath());
		System.out.println("date:"+new Date(file.lastModified()));
		
	}
}
