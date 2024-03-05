package own;

public class PartEmployee extends Employee
{
	private int hoursWorked;
	private double hourlyRate;
	public PartEmployee(String name,int id,int hoursWorked,double hourlyRate)
	{
		super(name,id);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	@Override
	public double calculateSal()
	{
		return hoursWorked*hourlyRate;
	}
}
