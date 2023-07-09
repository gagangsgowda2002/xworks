class Oil
{
	int cost;
	double quantity;
	String brand;
	String oilName;
	String vehicleName;
	
	Oil(int cost,double quantity,String brand,String oilName,String vehicleName)
	{
		this.cost=cost;
		this.quantity=quantity;
		this.brand=brand;
		this.oilName=oilName;
		this.vehicleName=vehicleName;
	}
	
	void printInstanceVariable()
	{
		System.out.println("cost="+cost);
		System.out.println("quantity="+quantity);
		System.out.println("brand="+brand);
		System.out.println("oilName="+oilName);
		System.out.println("vehicleName="+vehicleName);
	}
}