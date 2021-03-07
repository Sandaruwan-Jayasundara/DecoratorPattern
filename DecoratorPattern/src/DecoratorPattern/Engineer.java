package DecoratorPattern;

public class Engineer extends Employee {

	
	
	public Engineer() {
		description = "Engineer";
	}
	
	
	@Override
	public double getSalary() {
		return 60000.00;

	}

}
