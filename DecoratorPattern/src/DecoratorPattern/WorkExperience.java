package DecoratorPattern;

public class WorkExperience extends EmployeeQualification{
	
	Employee employee;

	public WorkExperience(Employee employee) {
		this.employee=employee;
	}
	
	
	
	@Override
	public String getDescription() {

		return "Working experiance";
	}

	@Override
	public double getSalary() {
		
		return employee.getSalary() + 20000;
	}

}
