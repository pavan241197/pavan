package capgemini_genrics;
class GenricType<T> {
	
	private T t;
	public T get () {
		return this.t;
	}
	public void set(T t)
	{
		this.t=t;
	}
public static class Test_Genrics2 {
	public static void main(String[] args) {
		GenricType type1= new GenricType ();
		type1.set("pankaj");
		type1.set(10);
		GenricType<String> type2 = new GenricType<>();
		type2.set("Pankaj");
		String str= type2.get();
		System.out.println(str);
		//type2.set(1);
		
	}
}
}