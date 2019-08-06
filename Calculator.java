public class Calculator {

	static int add(int n1, int n2) {
		return (n1 + n2);

	}

	static int sub(int n1, int n2) {
		return (n1 - n2);

	}

	public static void main(String[] args) {
		int n1, n2;
		n1 = 10;
		n2 = 15;
		int result1 = add(n1, n2);
		int result2 = sub(n1, n2);
		System.out.println(result1);
		System.out.println(result2);

	}

}