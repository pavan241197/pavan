package FunctionalInterface;

@FunctionalInterface
interface Hello {
	void sayHello();
	// void sayHi();
}

/*
 * //// Before JDK 8 //class HelloImpl implements Hello { // // @Override //
 * public void sayHello() { // System.out.println("helloImpl->Hello.."); // }
 * //}
 */
public class Test_FunctionalInterface {
	public static void main(String[] args) {
		/*
		 * // before JDK 8 // Hello hello = new HelloImpl(); //
		 * hello.sayHello();
		 * 
		 * // anonymous class implementation Hello hello1 = new Hello() {
		 * 
		 * @Override public void sayHello() {
		 * System.out.println("Anonymous->hello...."); } }; Hello hello2 = new
		 * Hello() {
		 * 
		 * @Override public void sayHello() {
		 * System.out.println("Anonymous->hi...."); } }; Hello hello3 = new
		 * Hello() {
		 * 
		 * @Override public void sayHello() {
		 * System.out.println("Anonymous->hihello...."); } }; hello1.sayHello();
		 * hello2.sayHello(); hello3.sayHello();
		 */
		Hello hello4 = () -> System.out.println("Lambda->hi....");
		Hello hello5 = () -> System.out.println("Lambda->hello....");
		Hello hello6 = () -> System.out.println("ALambda->hihello....");
		hello4.sayHello();
		hello5.sayHello();
		hello6.sayHello();
	}

}
