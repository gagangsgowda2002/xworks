class PrinterRunner{
	public static void main(String[] args){
		System.out.println("Running main method");
		Printer ref=new Printer();
		ref.brandName="Epson";
		ref.color="Color print";
		ref.blackAndWhite=false;
		
		ref.displayInstance();
		
		Printer ref1=new Printer();
		ref1.brandName="Samsung";
		ref1.color="Black- white";
		ref1.blackAndWhite=true;
		
		ref1.displayInstance();
		
		Printer ref2=new Printer();
		ref2.brandName="Canon";
		ref2.color="Color print";
		ref2.blackAndWhite=false;
		
		ref2.displayInstance();
	}
}