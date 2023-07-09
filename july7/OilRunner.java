class OilRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in OilRunner");
		Oil oil=new Oil(5000,1000,"Bharat petroleum","petrol Oil","Bike");
		oil.printInstanceVariable();
		System.out.println("Updated variables");
		oil.cost=2000;
		oil.quantity=200;
		oil.brand="ABC";
		oil.oilName="petrol";
		oil.vehicleName="bike";
		oil.printInstanceVariable();
	}
}