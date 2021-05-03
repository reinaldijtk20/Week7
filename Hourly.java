
public class Hourly extends Employee {

	private int hoursWorked;
	
	public Hourly(String name, String address, String phone, 
				  String soSecNumber, double rate) 
	{
		super(name, address, phone, soSecNumber, rate);
		hoursWorked = 0;
	}
	
	public void addHours(int moreHours){
		hoursWorked += moreHours;
	}

	@Override
	public double pay() {
		double payment = super.rate * hoursWorked;
		hoursWorked = 0;
		return payment;
	}
	
	public String toString(){
		return super.toString() + "\nCurrent hours : " + hoursWorked;
	}
}
