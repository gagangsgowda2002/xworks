class WorkerRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in WorkerRunner");
		Worker ref=new Worker("Raj","hassan",30,30000,"Male");
		ref.printInstanceVariable();
		System.out.println("Updated variables");
		ref.workerName="mahesh";
		ref.place="bangalore";
		ref.salary=35000;
		ref.age=35;
		ref.gender="male";
		ref.printInstanceVariable();
	}
}