class SimCard{
	static String brandName;
	String network;
	boolean mobile;
	
	void displayInstance(){
		System.out.println(this.network);
		System.out.println(this.mobile);
		displaystatic();
	}
	static String displaystatic(){
		System.out.println(brandName);
		return brandName;
	}
}