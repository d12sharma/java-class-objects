class EmployeeDetails {
	 
	private String name;
    private int empId;
    private double salary;

    public EmployeeDetails(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details:\nName: " + name + "\nID: " + empId + "\nSalary: " + salary);
    }
	
	public static void main(String[] args) {
        EmployeeDetails emp1 = new EmployeeDetails("Dhruv Sharma", 45, 100000);
        emp1.displayDetails();
    }

   
}

/*
Employee Details:
Name: Dhruv Sharma
ID: 45
Salary: 100000.0
*/