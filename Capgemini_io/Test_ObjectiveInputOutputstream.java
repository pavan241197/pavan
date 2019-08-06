package Capgemini_io;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;

public class Test_ObjectiveInputOutputstream {
	public static void main(String[] args) {
		Student s1= new Student (101, "Vinay", 75.5f);
		File file =new File ("C:\\CAPGEMINI\\data.out");
		try (
			FileOutputStream fileOutput = new FileOutputStream(file);
			ObjectOutputStream objectOutput = new ObjectOutputStream (fileOutput))
			{
				objectOutput.writeObject(s1);
				objectOutput.flush();
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
				
			}
	}
}





