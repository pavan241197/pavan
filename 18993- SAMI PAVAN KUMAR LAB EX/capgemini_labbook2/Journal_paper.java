package capgemini_labbook2;

class Journal_paper extends WrittenItem {
	private int yearpublished;

	public Journal_paper() {
		yearpublished = 0;
	}

	public Journal_paper(int yearpublished) {
		this.yearpublished = yearpublished;
	}

	@Override
	public String getAuthor() {
		return author;
	}

	@Override
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int getuniqueidentificationnumber() {
		return uniqueidentificationnumber;
	}

	@Override
	public void setuniqueidentificationnumber(int uniqueidentificationnumber) {
		this.uniqueidentificationnumber = uniqueidentificationnumber;
	}

	@Override
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	@Override
	public int getNumber_of_copies() {
		return number_of_copies;
	}

	public void setNumber_of_Copies(int number_of_copies) {
		this.number_of_copies = number_of_copies;
	}

	@Override
	public String toString() {
		return "Journal_paper [yearpublished=" + yearpublished + ", author=" + author + ", uniqueidentificationnumber="
				+ uniqueidentificationnumber + ", Title=" + Title + ", number_of_copies=" + number_of_copies + "]";
	}

	public int getYearpublished() {
		return yearpublished;
	}

	public void setYearpublished(int yearpublished) {
		this.yearpublished = yearpublished;

	}

}
