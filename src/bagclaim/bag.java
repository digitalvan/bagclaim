package bagclaim;

// <bag_number> <entry_point> <flight_id>

public class bag {
	private String bag_number;
	private String entry_point;
	private String flight_id;

	public bag(String b_number, String e_point, String f_id) {

		this.setBag_number(b_number);
		this.setEntry_point(e_point);
		this.setFlight_id(f_id);

	}

	public String getBag_number() {
		return bag_number;
	}

	public void setBag_number(String bag_number) {
		this.bag_number = bag_number;
	}

	public String getEntry_point() {
		return entry_point;
	}

	public void setEntry_point(String entry_point) {
		this.entry_point = entry_point;
	}

	public String getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(String flight_id) {
		this.flight_id = flight_id;
	}

}
