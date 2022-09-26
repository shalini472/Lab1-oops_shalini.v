package managerooms1;

public class Room extends Floor{

	int number;
	String occupancy;
	Boolean airConditiong;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}
	
	public String getOccupancy() {
		return occupancy;
	}

	

	public void setOccupancy(String occupancy) {
		this.occupancy = occupancy;
	}

	public Boolean getAirConditiong() {
		return airConditiong;
	}
	public void setAirConditiong(Boolean airConditiong) {
		this.airConditiong = airConditiong;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public Room(Integer number, String occupancy, Boolean airConditiong) {
		super();
		this.number = number;
		this.occupancy = occupancy;
		this.airConditiong = airConditiong;
	}

}
