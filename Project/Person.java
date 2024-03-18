package Project;

public class Person {
	private String name;
	private String address;
	
	public Person(String name) {
		super();
		this.name = name;
		this.address = "Not defined";
	}

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
