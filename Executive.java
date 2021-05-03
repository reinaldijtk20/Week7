
public class Executive extends Employee{
	
	private double bonus;
	
	public Executive(String name, String address, String phone, String soSecNumber, double rate) {
		super(name, address, phone, soSecNumber, rate);
		bonus = 0;
	}
	
	public void awardBonus(double execBonus){
		bonus = execBonus;
	}

	@Override
	public double pay() {
		double payment = super.pay() + bonus;
		bonus = 0;
		return payment;
	}	
}
