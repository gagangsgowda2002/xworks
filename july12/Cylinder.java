class Cylinder{
	static String name;
	double weight;
	double height;
	
	void displayInstance(){
		System.out.println(this.weight+"kg");
		System.out.println(this.height+"cm");
		displaystatic();
	}
	static String displaystatic(){
		System.out.println(name);
		return name;
	}
}