package Question4;

import javax.security.auth.Subject;

public class Company {
    private String companyID;
    private String companyName;
    private Employee [] employees;
    private int employeeCount;

    public Company(String companyID, String companyName) {
        this.companyID = companyID;
        this.companyName = companyName;
        this. employees = new Employee[5];
        this.employeeCount = 0;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void addEmployee(Employee employee) {
        if (employeeCount < 5){
            employees[employeeCount] = employee;
            employeeCount++;
            employee.setCompany(this);
        } else {
            System.out.println("Cant connected  more than 5 employees");
        }
    }

    public void displayCompanyDetails() {
        System.out.println("Company ID: " + companyID);
        System.out.println("Company Name: " + companyName);
        System.out.println("Number of Employees: " + employeeCount);
        System.out.println("Employee Details: ");

        for (int i =0; i < employeeCount ; i++){
            employees[i].displayEmployeeDetails();
            System.out.println("-----------------------------");
        }
    }
}
