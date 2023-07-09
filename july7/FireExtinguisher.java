class FireExtinguisher
{ 
	String brand;
	String rangeOfJet;
	String bodyMaterial;
	double weight;
	String typeOfFireExtinguisher;
	
	FireExtinguisher(String brand,String rangeOfJet,String bodyMaterial,double weight,String typeOfFireExtinguisher)
	{
		this.brand=brand;
		this.rangeOfJet=rangeOfJet;
		this.bodyMaterial=bodyMaterial;
		this.weight=weight;
		this.typeOfFireExtinguisher=typeOfFireExtinguisher;
	}
	
	void printInstanceVariable()
	{ 
		System.out.println("Brand="+brand);
		System.out.println("RangeOfJet="+rangeOfJet);
		System.out.println("bodyMaterial="+bodyMaterial);
		System.out.println("Weight="+weight);
		System.out.println("TypeOfFireExtinguisher="+typeOfFireExtinguisher);
	}
}