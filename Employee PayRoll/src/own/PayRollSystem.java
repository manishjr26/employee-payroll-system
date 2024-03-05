package own;

import java.util.ArrayList;

public class PayRollSystem 
{
	private ArrayList<Employee> employeeList;
	public PayRollSystem()
	{
		employeeList=new ArrayList<>();
	}
	public void addEmployee(Employee employee)
	{
		employeeList.add(employee);
	}
	public void removeEmployee(int id)
	{
		Employee rem=null;
		for(Employee employee:employeeList)
		{
			 if(employee.getId()==id)
			 {
				 rem=employee; break;
			 }
		}if(rem!=null)
		{
			employeeList.remove(rem);
		}
		
	}
	public void displayEmployee()
	{
		for(Employee employee:employeeList)
		{
			System.out.println(employee);
		}
	}
}
