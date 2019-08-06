package capgemini.exception;

//import java.io.FileInputStream;

//java MyException 10 a
// java MyException 10 0
public class MyException {
	private static int div1(int no1, int no2) {
		// unhandled exception type Exception
		try {
			if (no2 <= 0)
				throw new Exception("no2 has a value=" + no2);
		} catch (Exception e) {
			System.err.println("cannot be divided by 0");
		}
		return no1 / no2;
	}

	private static int div2(int no1, int no2) throws Exception {
		if (no2 <= 0)
			throw new Exception("second value=" + no2);
		return no1 / no2;
	}

	private static int div3(int no1, int no2) throws DivisionException {
		if (no2 <= 0)
			throw new DivisionException("second value=" + no2);
		return no1 / no2;
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Started");
		if (args.length < 2) {
			System.out.println("please provide 2 arguments");
			System.exit(0);

		}
		int no1, no2, result;
		no1 = no2 = result = 0;
			no1 = Integer.parseInt(args[0]);
			no2 = Integer.parseInt(args[1]);
			try {
			result = div1(no1, no2);
			result = div2(no1, no2);
			result = div3(no1, no2);
			System.out.println("Result:" + result);
		} catch (NumberFormatException ex) {
			System.err.println("provide 2 numeric arguments");
			ex.printStackTrace();
		} catch (ArithmeticException ex) {
			System.err.println("please provide both numeric non 0 arguments...");
		} finally {
			System.out.println("i will execute always...");
		}
		System.out.println("end");
	}

}
