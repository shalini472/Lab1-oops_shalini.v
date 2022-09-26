package managerooms1;

import java.util.Scanner;

public class Hotel{

	public Hotel(Floor[] floors) {
		super();
		this.floors = floors;
	}

	Floor[] floors;
	
	public Floor[] getFloors() {
		return floors;
	}

	
	public String getDetails(String str1) {
		return str1;
	}
	public void setFloors(Floor[] floors) {
		this.floors = floors;
	}

	public Hotel() {
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Room r1=new Room(101,"Single Occupancy",true);
		Room r2=new Room(102,"Double Occupancy",true);
		Room r3=new Room(103,"Double Occupancy",false);
		Room r4=new Room(201,"Single Occupancy",true);
		Room r5=new Room(202,"Single Occupancy",false);
		Room r6=new Room(203,"Double Occupancy",true);
		Room r7=new Room(204,"Triple Occupancy",true);
		Room[] rooms1= {r1,r2,r3};
		Room[] rooms2= {r4,r5,r6};
		Floor firstFloor=new Floor(rooms1);
		Floor secondFloor=new Floor(rooms2);
		Floor[] floors= {firstFloor,secondFloor};
		Hotel h1=new Hotel(floors);
		Scanner sc=new Scanner("give the type of occupancy");
		String str1=sc.next();
		h1.getDetails(str1);
		// TODO Auto-generated method stub
	}

}

