package Question4;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("E101","Alice Johnson");
        Employee e2 = new Employee("E102","Bob Smith");
        Employee e3 = new Employee("E103","Carol White");
        Employee e4 = new Employee("E104"," David Brown");

        Company c1 = new Company(" C001","TechNova Solutions");

        c1.addEmployee(e1);
        c1.addEmployee(e2);
        c1.addEmployee(e3);
        c1.addEmployee(e4);

        System.out.println("=== Company Information ===");
        c1.displayCompanyDetails();

        System.out.println("==== Individual Employee Details ===");
        e2.displayEmployeeDetails();
        System.out.println("-------------------------------------");



    }
}
