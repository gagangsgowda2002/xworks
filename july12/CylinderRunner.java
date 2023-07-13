class CylinderRunner{
	public static void main(String[] args){
		System.out.println("Running main method");
		Cylinder ref=new Cylinder();
		ref.name="Indian";
		ref.weight=27;
		ref.height=85;
		
		ref.displayInstance();
		
		Cylinder ref1=new Cylinder();
		ref1.name="Bharath";
		ref1.weight=25;
		ref1.height=85;
		
		ref1.displayInstance();
		
		Cylinder ref2=new Cylinder();
		ref2.name="HP";
		ref2.weight=28;
		ref2.height=85;
		
		ref2.displayInstance();
	}
}