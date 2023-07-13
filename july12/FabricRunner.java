class FabricRunner{
	public static void main(String[] args){
		System.out.println("Running main method");
		Fabric ref=new Fabric();
		ref.name="Cotton";
		ref.price=3300;
		
		ref.displayInstance();
		
		Fabric ref1=new Fabric();
		ref1.name="softSilk";
		ref1.price=4800;
		
		ref1.displayInstance();
		
		Fabric ref2=new Fabric();
		ref2.name="silk";
		ref2.price=4500;
		
		ref2.displayInstance();
	}
}