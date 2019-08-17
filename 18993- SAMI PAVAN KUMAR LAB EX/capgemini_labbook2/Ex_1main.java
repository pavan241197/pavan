package capgemini_labbook2;

import java.util.Scanner;

public class Ex_1main {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		switch (n) {
		case 1:
			Video v = new Video();
			v.setDirector("Rajamouli");
			v.setGenre("Melody");
			v.setNumber_of_Copies(9);
			v.setRunTime(5);
			v.setTitle("sye");
			v.setuniqueidentificationnumber(10);
			System.out.println(v.toString());
			break;

		case 2:
			Cd c = new Cd();
			c.setArtist("Nitin");
			c.setGenre("Melody");
			c.setNumber_of_copies(9);
			c.setRuntime(5);
			c.setTitle("sye");
			c.setUniqueIdentificationnumber(10);
			System.out.println(c.toString());
			break;

		case 3:
			Book b = new Book();
			b.setNumber_of_Copies(9);
			b.setTitle("Sye");
			b.setuniqueidentificationnumber(10);
			b.setAuthor("amy");
			System.out.println(b.toString());
			break;

		case 4:
			Journal_paper j = new Journal_paper();
			j.setNumber_of_Copies(9);
			j.setTitle("Sye");
			j.setAuthor("amy");
			j.setYearpublished(2001);
			System.out.println(j.toString());
			break;

		}
	}

}
