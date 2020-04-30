package my_package;

public class OccupiedSeat {

	public int room;
	public int row;
	public int column;
	
	public OccupiedSeat() {
		
	}
	public OccupiedSeat(int room, int row, int column) {
		this.room = room;
		this.row = row;
		this.column = column;
	}
	@Override
	public String toString() {
		return "[" + room + ", " + row + ", " + column + "]\n";
	}

}
