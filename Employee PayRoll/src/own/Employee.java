package own;

public abstract class Employee
{
	private String name;
	private int id;
	Employee(String name,int id)
	{
		this.id=id;
		this.name=name;
		
	}
	public int getId() { return id;}
	public String getName() {return name;}
	
	public void setId(int id) {this.id=id;}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Employee [name="+name+",id="+id+",salary="+calculateSal()+"]";
	}
	public abstract double calculateSal();
}
