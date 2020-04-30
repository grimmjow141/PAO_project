package my_package;

import my_package.Utility.Exc;

public class Client implements Comparable<Client>{

	private String first_name;
	private String last_name;
	private Exc exc;
	
	Client() {
		this(null, null, null);
	}
	
	Client (String first_name) {
		this(first_name, null, null);
	}
	
	Client (String first_name, Exc exc) {
		this(first_name, null, exc);
	}
	
	Client(String first_name, String last_name) {
		this(first_name, last_name, null);
	}
	
	Client(String first_name, String last_name, Exc exc) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.exc = exc;
	}
	
	public String getFirst_name () {
		return first_name;
	}
	
	public String getLast_name () {
		return last_name;
	}
	
	public String getFull_name () {
		//if ()
		if (first_name == null)
			return last_name;
		else if (last_name == null)
			return first_name;
		return first_name + " " + last_name;
	}

	public Exc getExc() {
		return exc;
	}
	
//	public static Client getClient (String[] data) {
//		String first_name, last_name;
//		if (data[0].contains(" ")) {
//			first_name = data[0].split(" ")[0];
//			last_name = data[0].split(" ")[1];
//		}
//		else {
//			first_name = data[0];
//			last_name = null;
//		}
//		if (data[1].compareTo("null") != 0)
//			return new Client(first_name, last_name, Exc.valueOf(data[1]));
//		else
//			return new Client(first_name, last_name);
//	}
	
	
	@Override
	public String toString() {
		String result;
		if (exc == null)
			result = String.format("Client: [%s]", getFull_name());
		else
			result = String.format("Client: [%s | %s]", getFull_name(), getExc());
		return result;
	}

	@Override
	public boolean equals(Object obj) { //overriding this method to compare clients properly
		if (this == obj)                //using their names, not just the location memory
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Client))
			return false;
		Client aux = (Client) obj;
		if (getFull_name().compareTo(aux.getFull_name()) == 0) 
			return true;
		return false;
	}
	
	@Override
	public int hashCode() { //generating the hash_code only from the names
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		return result;
	}
	
	@Override
	public int compareTo (Client obj) { //we want to order clients lexicographical
		if (first_name.compareTo(obj.first_name) != 0)
			return first_name.compareTo(obj.first_name);
		else if (last_name.compareTo(obj.last_name) != 0)
				return last_name.compareTo(obj.last_name);
			else 
				return 0;
	}
	
}
