class Printer{
	static String brandName;
	String color;
	boolean blackAndWhite;
	
	void displayInstance(){
		System.out.println(this.color);
		System.out.println(this.blackAndWhite);
		displaystatic();
	}
	static String displaystatic(){
		System.out.println(brandName);
		return brandName;
	}
}