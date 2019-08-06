package capgemini.lang;

public class SimpleString {
public static void main(String[] args) {
	String s1= "JAVA";
	String s2= "JAVA";
	String s3= new String ("JAVA");
			//char[] value = new char[] {'J','A','V','A'};
	char[] value = {'J','A','V','A'};
	String s4= new String (value);
	String s5= new String(s4);
	if(s1==s2){
		//values are same and memory location are also same
		System.out.println("s1==s2");
	}
	if(s1!=s3){
		//value are same  and memory location are also same
		System.out.println("s1!=s3");
	}
	System.out.println("s1 equals s2"+s1.equals(s2));
	System.out.println("s1 equals s3"+s1.equals(s3));
	System.out.println("s4 equals s5"+s4.equals(s5));
		System.out.println(s1.indexOf('A'));
	}
}
