package capgemini_labbook2;

class Video extends MediaItem {
	private int runtime, yearReleased;
	private String director, genre;

	public int getRuntime() {
		return runtime;
	}

	public void setRunTime(int runtime) {
		this.runtime = getRuntime();
	}

	public Video() {
		this.runtime = 0;
		this.yearReleased = 0;
		this.director = null;
		this.genre = null;
	}

	public Video(int runtime, int yearReleased, String director, String genre) {
		setDirector(director);
		setGenre(genre);
		setYearReleased(yearReleased);
	}

	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}

	public void setDirector(String string) {
		this.director = director;
	}

	public void setGenre(String string) {
		this.genre = genre;
	}

	@Override
	public void setuniqueidentificationnumber(int uniqueidentificationnumber) {
		this.uniqueidentificationnumber = uniqueidentificationnumber;
	}

	@Override
	public void setNumber_of_Copies(int number_of_Copies) {
		this.number_of_copies = number_of_Copies;
	}

	@Override
	public void setTitle(String title) {
		this.Title = title;
	}

	public String getDirectior() {
		return Title;
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public String getGenre() {
		return genre;
	}

	@Override
	public String getTitle() {
		return Title;
	}

	@Override
	public int getNumber_of_copies() {

		return number_of_copies;
	}

	@Override
	public int getuniqueidentificationnumber() {

		return uniqueidentificationnumber;
	}

	@Override
	public String toString() {
		return "Video [runtime=" + runtime + ", yearReleased=" + yearReleased + ", director=" + director + ", genre="
				+ genre + "]";
	}

}
