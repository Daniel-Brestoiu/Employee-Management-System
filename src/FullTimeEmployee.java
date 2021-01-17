//Daniel Brestoiu
//861768


public class FullTimeEmployee extends EmployeeInfo
{
	
	private double annualSalary;

	/*
	public FullTimeEmployee()
	{
		employeeNumber = 0;
		firstName = "";
		lastName = "";
		gender = 0;
		workLocation = 0;
		deductionRate = 0;
		annualSalary = 0;
	}
	*/
	
	
	 public FullTimeEmployee()
	 {
		super();	 
		annualSalary = 0;
	 }
	 
	 public FullTimeEmployee(int eN, String fN, String lN, int gender, int wL, double dR, double aS)
	 {
		 super(eN, fN, lN, gender, wL, dR);
		 annualSalary = aS;
	 }
	 
	 //int eN, String fN, String lN, int gndr, int wL, double dR, int aS
	 
	 
	 
	 //setter
	 public void setAnnualSalary(double aS)
	 {
		 annualSalary = aS;
	 }
	 
	 //getter
	 public double getAnnualSalary()
	 {
		 return(annualSalary);
	 }
	 
}