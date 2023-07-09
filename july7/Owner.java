class Owner
{
	String ownerName;
	int age;
	String place;
	double investment;
	String qualification;
	
	Owner(String ownerName,int age,String place,double investment,String qualification)
	{
		this.ownerName=ownerName;
		this.age=age;
		this.place=place;
		this.investment=investment;
		this.qualification=qualification;
	}
	
	void print()
	{
		System.out.println("ownerName="+ownerName);
		System.out.println("age="+age);
		System.out.println("place="+place);
		System.out.println("investment="+investment);
		System.out.println("qualification="+qualification);
	}
}