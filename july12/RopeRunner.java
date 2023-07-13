class RopeRunner{
	public static void main(String[] args){
		System.out.println("Running main method");
		Rope ref=new Rope();
		ref.Strength="Strong";
		ref.length=100;
		
		ref.displayInstance();
		
		Rope ref1=new Rope();
		ref1.Strength="strong";
		ref1.length=150;
		
		ref1.displayInstance();
		
		Rope ref2=new Rope();
		ref2.Strength="strong";
		ref2.length=200;
		
		ref2.displayInstance();
	}
}