package Capgemini_io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_InputOutputStream3 {
	public static void main(String[] args) {
		String message = "we are learning java language";
		File file = new File("C:\\CAPGEMINI\\ReadMe.txt ");
		try(FileOutputStream fileOutput = new FileOutputStream(file)) {
			fileOutput.write(message.getBytes());
			fileOutput.flush();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

