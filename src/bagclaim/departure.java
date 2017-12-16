package bagclaim;

//<flight_id> <flight_gate> <destination> <flight_time>

public class departure {

	private String flight_id;
	private String flight_gate;
	private String destination;
	private String flight_time;

	public departure(String f_id, String f_gate, String f_dest, String f_time) {

		this.setFlight_id(f_id);
		this.setFlight_gate(f_gate);
		this.setDestination(f_dest);
		this.setFlight_time(f_time);

	}

	public String getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(String flight_id) {
		this.flight_id = flight_id;
	}

	public String getFlight_gate() {
		return flight_gate;
	}

	public void setFlight_gate(String flight_gate) {
		this.flight_gate = flight_gate;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlight_time() {
		return flight_time;
	}

	public void setFlight_time(String flight_time) {
		this.flight_time = flight_time;
	}

	public String getDepature() {

		return getFlight_id() + " " + getDestination() + " " + getFlight_gate() + " " + getFlight_time();

	}

}
