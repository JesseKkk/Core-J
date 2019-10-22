package pair3;


public class Manager extends Employee
{
	private double bonus;
	Manager(String name, double salary)
	{
		super(name, salary);
		this.bonus = 0;
	}
	
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	
	public double getBonus()
	{
		double baseBonus = super.getSalary();
		return baseBonus + bonus;
	}
}