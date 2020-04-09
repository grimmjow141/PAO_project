package my_package;

public class Client {

	private String full_name;
	private Utility.Exc exc;
	
	Client(String full_name) {
		this.full_name = full_name;
	}
	
	Client(String full_name, Utility.Exc exc) {
		this.full_name = full_name;
		this.exc = exc;
	}

	public Utility.Exc getExc() {
		return exc;
	}
	
}
