package capgemini_labbook8;

import java.time.*;

public class lab8ex_6 {
	public static void main(String[] args) {

		LocalDate pdate = LocalDate.of(2010, 10, 025);
		LocalDate now = LocalDate.now();
	

		Period diff = Period.between(pdate, now);

		System.out.printf("\nDifference is %d years, %d months and %d days,\n\n", diff.getYears(), diff.getMonths(),
				diff.getDays());
	}

}
