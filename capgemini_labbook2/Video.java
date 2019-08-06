package capgemini_labbook2;

 class Video extends MediaItem {
	 private int runtime,yearReleased;
	 private String director,genre;
	 public int getRuntime() {
		return runtime;
		}
	 public void setRunTime(int runtime) {
		this.runtime= runtime();
		
		}
	 public Video() {
		 this.runtime=0;
		 this.yearReleased=0;
		 this.director=null;
		 this.genre=null; 
	 }
	public Video (int runtime, int yearReleased, int  ) {
		
	}
	 
	 
	 

	private int runtime() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setDirector(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setGenre(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setNumber_of_copies(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setRuntime(int i) {
		// TODO Auto-generated method stub
		
	}


	public void setTitle(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setUniqueIdentificationnumber(int i) {
		// TODO Auto-generated method stub
		
	}


	

	@Override
	public int getuniqueidentificationnumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setuniqueidentificationnumber(int uniqueidentificationnumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNumber_of_copies() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNumber_of_Copies(int number_of_Copies) {
		// TODO Auto-generated method stub
		
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}


}
