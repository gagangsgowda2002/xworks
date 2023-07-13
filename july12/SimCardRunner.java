class SimCardRunner{
	public static void main(String[] args){
		System.out.println("Running main method");
		SimCard ref=new SimCard();
		ref.brandName="Jio";
		ref.network="4G";
		ref.mobile=false;
		
		ref.displayInstance();
		
		SimCard ref1=new SimCard();
		ref1.brandName="Airtel";
		ref1.network="5G";
		ref1.mobile=true;
		
		ref1.displayInstance();
		
		SimCard ref2=new SimCard();
		ref2.brandName="BSNL";
		ref2.network="4G";
		ref2.mobile=true;
		
		ref2.displayInstance();
	}
}