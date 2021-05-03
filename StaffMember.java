
public abstract class StaffMember {
	protected String name;
	protected String address;
	protected String phone;
	
	public StaffMember(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public String toString(){
		return "Name : " + name + "\n"
				+ "Address : " + address + "\n"
				+ "Phone : " + phone + "\n";
	}
	
	public abstract double pay();
}
