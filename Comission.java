
public class Comission extends Hourly {

	private double comissionRate;
	private double totalSales = 0;
	
	public Comission(String name, String address, String phone, 
			String soSecNumber, double rate, double comRate) {
		super(name, address, phone, soSecNumber, rate);
		comissionRate = comRate;
	}
	
	public void addSales(double totalSale){
		totalSales += totalSale;
	}
	
	@Override
	public String toString(){
		return super.toString() + "\nTotal Sales : " + totalSales;
	}

	@Override
	public double pay() {
		double result = super.pay()  + (totalSales * comissionRate);
		return result;
	}
}