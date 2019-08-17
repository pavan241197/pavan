package capgemini_labbook10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

	class CopyDataThread extends Thread {
		public CopyDataThread(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
			int count = 0;
			int c;
			try {
				c = fileInputStream.read();
				while (c != -1) {
					count++;
					fileOutputStream.write((char) c);
					if (count == 100) {
						System.out.println("10 characters are copied");
						Thread.sleep(1);
						count = 0;
					}
					c = fileInputStream.read();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {

		}
	}

public class lab10_ex_1  {
		public static  void main(String[] args) {
			File file = new File("C:\\CAPGEMINI\\Multiplemain.txt");
			try {
				FileInputStream fileInputStream = new FileInputStream(file);
				FileOutputStream fileOutputStream = new FileOutputStream("C:\\CAPGEMINI\\target.txt");
				CopyDataThread copyDataThread = new CopyDataThread(fileInputStream, fileOutputStream);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			Thread t1 = new Thread();
			t1.start();
		}

	}

