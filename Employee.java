
public class Employee extends StaffMember{
	
	protected String socialSecurityNumber;
	protected double rate;
	
	public Employee(String name, String address, String phone,
					String soSecNumber, double rate) 
	{
		super(name, address, phone);
		socialSecurityNumber = soSecNumber;
		this.rate = rate;
	}
	
	public String toString(){
		return super.toString() + "Social Security Number : " + socialSecurityNumber;
	}

	@Override
	public double pay() {
		return rate;
	}
}
