public class EmployeeTestStatic
{
	public static void main(String[] args)
	{
		Employee staff;
		staff = new Employee("John", 12345);
		staff.setId();
		Employee staff2 = new Employee("Doe", 67890);
		staff2.setId();
		System.out.println(staff.nextId + " | " + staff2.nextId);
	}
}
class Employee
{
	private String name;
	private double salary;
	private int id;
	public static int nextId = 1;

	public Employee(String _name, double _salary)
	{
		name = _name;
		salary = _salary;
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent/100;
		salary += raise;
	}

	public void printEmployee()
	{
		System.out.println("Name: " + name + " salary: " + salary);
	}

	public void setId()
	{
		id = nextId;
		nextId++;
	}
}