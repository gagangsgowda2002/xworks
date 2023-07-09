class OwnerRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in OwnerRunner");
		Owner owner=new Owner("raj",35,"manglore",2200000,"dgree");
		owner.print();
		System.out.println("Updated variables");
		owner.ownerName="ABC";
		owner.age=30;
		owner.place="Bangalore";
		owner.investment=3500000;
		owner.qualification="B.E";
		owner.print();
	}
}