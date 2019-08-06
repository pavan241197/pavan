package capgemini.lang;
import capgemini_javabeans.*;
//public class My_System extends System {
public class MySystem{
	public static void main(String[] args) {
		//system = new System(); //can not be instantiated.
	long startMemory = Runtime.getRuntime().freeMemory();
	long startTimeMillis=System.currentTimeMillis();//current time milli seconds
	
		System.out.println("start Memory:"+startMemory);
		System.out.println("start Time:"+startTimeMillis);
		//consuming memory...
		for(int index=0;index<10000;index++){
			new Employee();
		}
		System.out.println("Last employee Id:"+Employee.SEQUENCE);
		System.out.println("Total employee Count:"+Employee.COUNT);//3
		long endTimeMillis = System.currentTimeMillis();
		long endMemory = Runtime.getRuntime().freeMemory();
		
		System.out.println("End Memory:"+endMemory);
		System.out.println("End Time:"+endTimeMillis);
		System.exit(0);
	}

}
