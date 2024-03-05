package own;
public class Main 
{
	public static void main(String[] args) 
	{
		PayRollSystem  rs=new PayRollSystem();
		System.out.println(" \tWelcome to Employee PayRoll System\n\t Click \t 1 - Add FullTime Employee \t 2 - PartTime Employee ");
		java.util.Scanner mr=new java.util.Scanner(System.in);
		int userChoice=mr.nextInt();
		if(userChoice==1)
		{
			System.out.println(" Enter name");
			java.util.Scanner mr1=new java.util.Scanner(System.in);
			String name=mr1.nextLine();
			System.out.println(" Enter id");
			int id=mr.nextInt();
			System.out.println(" Enter monthly salary");
			double sal=mr.nextDouble();
			FullEmployee fm=new FullEmployee(name,id,sal);
			rs.addEmployee(fm);
			System.out.println(name+"  Employee added Successfully! ");
			System.out.println(" Do wish \n\t 1 - display employees \t 2 - remove employee  ");
			int userChoice1=mr.nextInt();
			if(userChoice1==1)
			{
				rs.displayEmployee(); System.exit(0);
			}else if(userChoice1==2)
			{
				
				System.out.println("Enter employee id to remove");
				int id1=mr.nextInt();
				rs.removeEmployee(id1); System.exit(0);
			}else
				System.exit(0);
			
		}else if(userChoice==2)
		{
			System.out.println(" Enter name");
			java.util.Scanner mr2=new java.util.Scanner(System.in);
			String name=mr2.nextLine();
			System.out.println(" Enter id");
			int id=mr.nextInt();
			System.out.println(" Enter hoursWorked by employee");
			int hoursWorked=mr.nextInt();
			System.out.println(" Enter hourlyRate of employee");
			double sal=mr.nextDouble();
			PartEmployee pm=new PartEmployee(name,id,hoursWorked,500);
			   rs.addEmployee(pm);
			   System.out.println(" Do wish \n\t 1 - display employees \t 2 - remove employee  ");
				int userChoice1=mr.nextInt();
				if(userChoice1==1)
				{
					rs.displayEmployee(); System.exit(0);
				}else if(userChoice1==2)
				{
					
					System.out.println("Enter employee id to remove");
					int id1=mr.nextInt();
					rs.removeEmployee(id1); System.exit(0);
				}else
					System.exit(0);
			
		}else
			System.exit(0);
	
		
	   
	   
	}

}
