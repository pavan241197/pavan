package capgemini_labbook2;

public class Book extends WrittenItem {
	@Override
	public String getAuthor() { 
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;		
	}

	@Override
	public int getuniqueidentificationnumber() {
	return uniqueidentificationnumber;
	}

	public void setUniqueIdentificationnumber(int uniqueIdentificationnumber) {
		this.uniqueidentificationnumber=uniqueIdentificationnumber;
		
	}
	@Override
	public String getTitle() {
		return Title;
	}
	@Override
	public void setTitle(String title) {
	this.Title=title;
	}

	@Override
	public int getNumber_of_copies() {
		return number_of_copies;
	}
	@Override
	public void setNumber_of_Copies(int number_of_Copies) {
		this.number_of_copies=number_of_Copies;
	}
	@Override
	public String toString() {
		return "Book [author=" + author + ", uniqueidentificationnumber=" + uniqueidentificationnumber + ", Title="
				+ Title + ", number_of_copies=" + number_of_copies + "]";
	}
	@Override
	public void setuniqueidentificationnumber(int uniqueidentificationnumber) {
		// TODO Auto-generated method stub
		
	}
	
	

	


	

}
