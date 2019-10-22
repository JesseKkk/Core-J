package pair3;


public class Employee
{
	private String name;
	private double salary;
	
	Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public String getName()
	{
		return name;
	}
}