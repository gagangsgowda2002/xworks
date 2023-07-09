class Worker
{
	String workerName;
	String place;
	double salary;
	int age;
	String gender;
	
	Worker(String workerName,String place,int age,double salary,String gender)
	{
		this.workerName=workerName;
		this.place=place;
		this.age=age;
		this.salary=salary;
		this.gender=gender;
	}
	
	void printInstanceVariable()
	{
		System.out.println("workerName="+workerName);
		System.out.println("place="+place);
		System.out.println("age="+age);
		System.out.println("salary="+salary);
		System.out.println("gender="+gender);
	}
}