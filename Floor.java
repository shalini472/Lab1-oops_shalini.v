package managerooms1;

public class Floor extends Hotel{

	Room[] room;
	public Room[] getRoom() {
		return room;
	}
	public void setRoom(Room[] room) {
		this.room = room;
	}
	public Floor(Room[] room) {
		super();
		this.room = room;
	}
	public Floor() {
		// TODO Auto-generated constructor stub
	}
	public String getBlock() {
		return null;
		
	}
	public static void main(String[] args) {
		
	}
		
}

