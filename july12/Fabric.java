class Fabric{
	static String name;
	double price;
	
	void displayInstance(){
		System.out.println(this.price+"rs");
		displaystatic();
	}
	static String displaystatic(){
		System.out.println(name);
		return name;
	}
}