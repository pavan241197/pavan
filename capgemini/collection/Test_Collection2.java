package capgemini.collection;
public class Test_Collection2 {
	public static void main1 (String[] args) { 
		public static void main (String[] args) 
			int _int =10;
			Integer _intObj = new Integer(10);
			
			_int =_intObj;
			_intObj=_int;
			
			//before JDK1.5 explicit conversion was added
			//object type is converted and assigned to object type;
			_int =_intObj.intValue();
			
			// Object type is converted and assigned to primitive tyep
			_intObj =Integer.valueOf(_int);
			
		}
	}
	
	 


