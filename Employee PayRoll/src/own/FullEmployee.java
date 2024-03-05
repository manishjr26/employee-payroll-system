package own;

public class FullEmployee extends Employee
{
	private double monthlySalary;
	public FullEmployee(String name,int id,double monthlySalary)
	{
		super(name,id);
		this.monthlySalary=monthlySalary;
	}
	@Override
	public double calculateSal() 
	{
		return monthlySalary;
	}
}
