class Rope{
	static String Strength;
	double length;
	
	void displayInstance(){
		System.out.println(this.length+"m");
		displaystatic();
	}
	static String displaystatic(){
		System.out.println(Strength);
		return Strength;
	}
}