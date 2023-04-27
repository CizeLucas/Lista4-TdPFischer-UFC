package questao02;

public class Empregado {

	private String firstName;
	private String lastName;
	private double monthlyWage;
	
	public Empregado(String firstName, String lastName, double monthlyWage) {
		this.firstName = firstName;
		this.lastName = lastName;
		if(monthlyWage>=0) 
			this.monthlyWage = monthlyWage;
		else
			monthlyWage=0;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String newLastName) {
		this.firstName = newLastName;
	}
	
	public double getMonthlyWage() {
		return this.monthlyWage;
	}
	
	public void setMonthlyWage(double newMonthlyWage) {
		if(newMonthlyWage>=0) 
			this.monthlyWage = newMonthlyWage;
		else
			monthlyWage=0;
	}
	
	public double CalculateAnnualSalary() {
		return (this.monthlyWage*12);
	}
	
	
	
	
	
	
}
