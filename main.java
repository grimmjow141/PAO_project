package my_package;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class main {

	public static void main(String[] args) {
		Client Anda = new Client("Petcu Anda", Utility.Exc.STUDENT);
		Movie movie = new Movie("Black panther 2", Utility.Type.ADVENTURE);
		Ticket ticket = new VIP_Ticket(movie, Anda, 3, 2, new Room(20, 15));
		System.out.println(ticket.getPrice());
		System.out.println(ticket.getKey_code());
	
		Cinema Patria = new Cinema();
		Patria.add_n_new_rooms(5, 10, 20);
		Patria.reserve_seat(3, 3, Patria.getHall().get(1), movie, Anda);
		System.out.println(Patria.getHall().get(1).getSeats()[3][3]);
		
		Order o1 = new Order("Cola", "Latte Coffe", "Popcorn");
		Order o2 = new Order("Popcorn", "Fanta");
		Order o3 = new Order();
		Bar bar = new Bar();
		bar.add_orders(o1, o2, o3);
		Queue <Order> x = bar.getOrders();
		for (int i = 0; i < 3; i ++)
			x.poll().print_menu_items();
	}
}
