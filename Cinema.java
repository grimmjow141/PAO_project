package my_package;

import java.util.LinkedList;
import java.util.List;

public class Cinema {
	private List <Room> hall;
	private Bar bar;
	private int max_capacity;
	private int nr_of_rooms;
	
	Cinema() {
		hall = new LinkedList<Room>();
		bar = new Bar();
		max_capacity = 0;
		nr_of_rooms = 0;
	}
	
	public void add_new_room(int width, int lenght) {
		hall.add(new Room(width, lenght));
		max_capacity += width * lenght;
		nr_of_rooms ++;
	}
	
	public void add_n_new_rooms (int n, int width, int lenght) { //adds n rooms with w x h seats each
		for (int i = 0; i < n; i ++)
			hall.add(new Room(width, lenght));
		max_capacity += n * width * lenght;
		nr_of_rooms += n;
	}
	
	public Ticket reserve_seat (int row, int column, Room room, Movie movie, Client client) {
		if (!room.getSeats()[row][column]) { 		//if the seat is not occupied
			room.getSeats()[row][column] = true;
			Ticket reserved_ticket = new Ticket(movie, client, row, column, room);
			return reserved_ticket;
		} else 
			return null;
	}
	//getters
	public List<Room> getHall() {
		return hall;
	}

	public int getMax_capacity() {
		return max_capacity;
	}

	public int getNr_of_rooms() {
		return nr_of_rooms;
	}
	
	public Bar getBar() {
		return bar;
	}
}
