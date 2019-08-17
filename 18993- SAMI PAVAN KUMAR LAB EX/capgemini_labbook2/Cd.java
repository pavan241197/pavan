package capgemini_labbook2;

public class Cd {

	private int number_of_copies;
	private String Title;
	private int uniqueidentificationnumber;
	private int Runtime;
	private String genre;
	private String Arist;

	public void setArtist(String artist) {
		this.Arist = artist;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setNumber_of_copies(int number_of_Copies) {
		this.number_of_copies = number_of_Copies;
	}

	public void setRuntime(int runtime) {
		this.Runtime = runtime;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public void setUniqueIdentificationnumber(int uniqueidentificationnumber) {
		this.uniqueidentificationnumber = uniqueidentificationnumber;
	}

	@Override
	public String toString() {
		return "Cd [number_of_copies=" + number_of_copies + ", Title=" + Title + ", uniqueidentificationnumber="
				+ uniqueidentificationnumber + ", Runtime=" + Runtime + ", genre=" + genre + ", Arist=" + Arist + "]";
	}

}
