package my_package;

public class Room {
	private int id;
	private int capacity;
	private boolean seats[][];
	private int width;
	private int lenght;
	private static int nr_of_rooms = 0;
	
	Room(int width, int lenght) {
		id = ++ nr_of_rooms;
		this.capacity = width * lenght;
		this.width = width;
		this.lenght = lenght;
		seats  = new boolean[width][lenght];
	}
	
	public int getId () {
		return id;
	}

	public boolean[][] getSeats() {
		return seats;
	}

	public int getWidth() {
		return width;
	}

	public int getLenght() {
		return lenght;
	}
}
