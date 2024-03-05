# Employee Payroll System
This project is an Employee Payroll System implemented in Java, following the principles of Object-Oriented Programming (OOP). The system supports two types of employees: Full-time employees and Part-time employees.

# Classes:
Employee:
  This is an abstract class that serves as the base class for both Full-time and Part-time employees.
  It contains an abstract method calculateSal() that must be implemented by its subclasses.
  Overrides the toString() method to display employee details.
  
FullEmployee:
  Represents full-time employees with attributes such as name, ID, and monthly salary.
  Extends the Employee class and implements the calculateSal() method.
  
PartEmployee:
  Represents part-time employees with attributes such as name, ID, hours worked, and hourly rate.
  Extends the Employee class and implements the calculateSal() method by multiplying hours worked by the hourly rate.
  
PayRoll:
  Manages the list of employees and provides methods to add, remove, and display employee details.
  Includes methods for calculating total payroll, average salary, etc.
  
# Usage:
Clone the repository: <br>
1.) Copy code
    git clone https://github.com/your-username/employee-payroll-system.git
    cd employee-payroll-system
    
2.) Compile the Java files:
    javac Main.java

3.) Run the application:
    java Main

# Contribution:
    Feel free to contribute to the project by suggesting improvements, reporting issues, or adding new features. Please follow the contribution guidelines before making any changes.

# License:
    This project is licensed under the MIT License.
