class EmployeeCompany {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    EmployeeCompany(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class EmployeeAndCompanyInformationManagement {
    public static void main(String[] args) {

        new EmployeeCompany("Aman", 45000);
        new EmployeeCompany("Riya", 55000);
        new EmployeeCompany("Karan", 60000);

        EmployeeCompany.printCompanyInfo();
    }
}