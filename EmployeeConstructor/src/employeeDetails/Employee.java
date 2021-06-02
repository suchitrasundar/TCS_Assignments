package employeeDetails;

public class Employee {
	
	private long empNo;
	private String name;
	private String designation;
	private double basicPay;
	

	public long getEmpNo() {
		return empNo;
	}

	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation=designation;
	}

	public double getBasicPay() {
		return basicPay;
	}
	
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(long empNo, String name, String designation, double basicPay) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.designation = designation;
		this.basicPay = basicPay;
	}
	
	 public void generateSalarySlip() {
		 
		 int CCA, Tax, HRA, netSalary;
		 CCA = (int) (this.basicPay *15)/100;
		 HRA = (int)(this.basicPay *20)/100;
		 Tax = (int) ( (this.basicPay + CCA + HRA)*10 ) / 100;
		 netSalary = (int) (this.basicPay + CCA + HRA) - Tax;

	       
	     System.out.println("\n-----------------------------------------------");
	     System.out.println(" \t \t \t ABC Company ");
	     System.out.println("-----------------------------------------------");
	     System.out.println("\n \t \t \t Salary Slip");
	     System.out.println("-----------------------------------------------");
	     System.out.println("Month : Jan \t \t \t \t Year : 2021");
	     System.out.println("-----------------------------------------------");
	       
	     System.out.println("Emp Id : "+this.empNo+ "\t\t\t\tName: " +this.name);
	     System.out.println("Designation : "+this.designation+ "\tBasic pay: " +this.basicPay);
	     System.out.println(" CCA : "+CCA+ "\t\t\t\t    HRA: " +HRA);
	     System.out.println(" Tax : "+Tax+ "\t\t\t\t    Net Salary: " +netSalary);
	     
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Employee employee = new Employee();

	     employee.setEmpNo(1001);
	     employee.setName("Anto");
	     employee.setDesignation("Consultant");
	     employee.setBasicPay(1000);

	        
	     employee.generateSalarySlip();	
	}
	
	
}
