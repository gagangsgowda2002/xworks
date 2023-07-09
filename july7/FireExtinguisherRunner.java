class FireExtinguisherRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in FireExtinguisherRunner");
		FireExtinguisher Fire=new FireExtinguisher("ABC","3,5,9 mtr","AP",7,"CO Based");
		Fire.printInstanceVariable();
		System.out.println("Updated variables");
		Fire.brand="ABC";
		Fire.rangeOfJet="7,8,9 mtr";
		Fire.bodyMaterial="AA";
		Fire.weight=20;
		Fire.typeOfFireExtinguisher="Fire Suppression Systems";
		Fire.printInstanceVariable();
	}
}