package Question4;

public class Employee {
    private String employeeID;
    private String employeeName;
    private Company company;

    public Employee(String employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;

    }

    public void setCompany(Company company){
        this.company = company;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: "  + employeeID );
        System.out.println("Employee Name: " + employeeName);
        if(company != null) {
            System.out.println("Company: " + company.getCompanyName());
        } else {
            System.out.println("Company not connected.");
        }
    }
}
