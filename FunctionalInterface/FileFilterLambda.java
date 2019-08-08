package FunctionalInterface;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {
	public static void main(String[] args) {
		FileFilter filter= (File pathname)->pathname.getName().endsWith(".txt");
		File dir=
	}

}
