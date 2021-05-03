
public class Staff {
	
	StaffMember[] staffList;
	
	public Staff(){
		staffList = new StaffMember[8];
		
		staffList[0] = new Executive("Sam", "123 Main Line", "555-0469",
				"123-45-6789", 2423.07 );
		
		staffList[1] = new Employee("Carla", "456 Off Line", "555-0101",
				"987-65-4321", 1246.15 );
		
		staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000",
				"010-20-3040", 1159.23 );
		
		staffList[3] = new Hourly("Diane", "678 Fifth Ave", "555-0690",
				"958-47-3625", 10.55 );
		
		staffList[4] = new Volunteer("Norm", "987 Suds Blvd", "555-8734");
		
		staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");
		
		staffList[6] = new Comission("Rudolf", "897 Sixth Ave", "575-9690",
				"916-67-2025", 6.25, 0.2 );
		
		staffList[7] = new Comission("Anne", "145 Third Ave", "505-0640",
				"908-47-1725", 6.25, 0.2 );
		
		((Executive)staffList[0]).awardBonus(500.00);
		((Hourly)staffList[3]).addHours(40);
		((Comission)staffList[6]).addHours(35);
		((Comission)staffList[6]).addSales(400);
		((Comission)staffList[7]).addHours(40);
		((Comission)staffList[7]).addSales(950);
	}
	
	public void payDay(){
		double amount;
		
		for(StaffMember staff : staffList){
			System.out.println(staff);
			
			amount = staff.pay();
			
			if(amount == 0.0)
				System.out.println("Thank you");
			else
				System.out.println("Paid " + amount);
			
			System.out.println("----------------------------------");
		}
	}
}
