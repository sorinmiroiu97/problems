package book;

public class AddressBook {

	private String first;
	private String last;
	private int phone;
	private String address;
	private String email;

	public AddressBook(String first, String last, int phone, String address, String email) {
		this.first = first;
		this.last = last;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}
	
	public AddressBook() {
		this.first = "";
		this.last = "";
		this.phone = 0;
		this.address = "";
		this.email = "";
	}
	
	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPrint() {
		return (getLast() + " " + getFirst() + " " + getPhone() + " " + getAddress() + " " + getEmail());
	}
	
	public void print() {
		System.out.println(getLast() + " " + getFirst() + " " + getPhone() + " " + getAddress() + " " + getEmail());
	}

}
