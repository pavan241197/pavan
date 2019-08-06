package capgemini_labbook8;

import java.io.File;
import java.io.FileReader;
import java.io.*;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.*;

public class lab8ex_2 {
	public static void main(String[] args) throws IOException {
		File file= new File("C:\\CAPGEMINI\\Multiplemain.java");
		try(FileReader fileReader=new FileReader(file))
		{
			LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
			String s=lineNumberReader.readLine();
			while(s!=null)
			{
				System.out.println(lineNumberReader.getLineNumber()+""+s);
				s=lineNumberReader.readLine();
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
