package DecoratorPattern;

public abstract class Employee {
	
	
	public String description;
	
	public Employee() {
		description = "General Employee Details";
	}
	

	public abstract double getSalary();
	
	
	
}
