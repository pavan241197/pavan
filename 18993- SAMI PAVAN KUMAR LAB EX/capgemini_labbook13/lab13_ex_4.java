package capgemini_labbook13;

import java.util.Arrays;
import java.util.List;

public class lab13_ex_4 {
	
	public static void main(String[] args) {
		List<String> loc = Arrays.asList(new String[] { "ongole", "chirala", "kavali" });
		loc.stream().map(City::new).forEach(System.out::print);
	}
}

class City {
	protected String getCity() {
		return city;
	}

	protected void setCity(String city) {
		this.city = city;
	}

	private String city;

	public City(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return city + " ";
	}

}