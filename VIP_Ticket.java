package my_package;

public class VIP_Ticket extends Ticket{
	VIP_Ticket(Movie movie, Client client, int row, int column, Room room) {
		super(movie, client, row, column, room);
		price += 0.25 * price; //the price of a VIP ticket is 25% higher
		key_code += "^VP";     //i also modify the ticket code just for fun!
	}
}
