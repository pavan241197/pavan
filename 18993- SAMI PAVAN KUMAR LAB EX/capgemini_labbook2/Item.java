package capgemini_labbook2;

abstract class Item {
	protected int uniqueidentificationnumber;
	protected String Title;
	protected int number_of_copies;
	
	public abstract int getuniqueidentificationnumber();
	public abstract void setuniqueidentificationnumber(int uniqueidentificationnumber);
	
	public abstract int  getNumber_of_copies();
	
	public abstract String getTitle();
	
	public abstract void setTitle(String title);
	
	public abstract void setNumber_of_Copies(int number_of_Copies);
	

}
