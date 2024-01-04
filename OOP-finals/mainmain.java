
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class InitialEmployeeData {
    private static List<Employee> initialEmployees = new ArrayList<>();

    static {
        initialEmployees.add(new Employee("John Doe", "123-456-7890", "Manager", "Excellent"));
        initialEmployees.add(new Employee("Jane Smith", "987-654-3210", "Developer", "Good"));
    }

    public static List<Employee> getInitialEmployees() {
        return new ArrayList<>(initialEmployees);
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();
        InitialEmployeeData i = new InitialEmployeeData();
        
EmployeeDatabase employeeDatabasecurrent = new EmployeeDatabase(i);
                                                                                   
        int choice;

        do {
            System.out.println("1. Add Employee\n2. View Employee Details\n3. Calculate Payroll\n" +
                    "4. Track Attendance\n5. Manage Leave\n0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    employeeDatabase.addEmployee();
                    break;
                case 2:
                    employeeDatabase.viewEmployeeDetails();
                    employeeDatabasecurrent.viewEmployeeDetails();
                    break;
                case 0:
                    System.out.println("Exiting the Employee Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

 class Employee {
    private String name;
    private String contactInformation;
    private String jobRole;
    private String performanceHistory;

    public Employee(String name, String contactInformation, String jobRole, String performanceHistory) {
        this.name = name;
        this.contactInformation = contactInformation;
        this.jobRole = jobRole;
        this.performanceHistory = performanceHistory;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public String getJobRole() {
        return jobRole;
    }

    public String getPerformanceHistory() {
        return performanceHistory;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public void setPerformanceHistory(String performanceHistory) {
        this.performanceHistory = performanceHistory;
    }
}

class EmployeeDatabase {
    private List<Employee> employees;

    public EmployeeDatabase(InitialEmployeeData i) {
        this.employees = new ArrayList<>(i.getInitialEmployees());
    }

    public EmployeeDatabase() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Enter employee name: ");
        employee.setName(scanner.nextLine());

        System.out.print("Enter contact information: ");
        employee.setContactInformation(scanner.nextLine());

        System.out.print("Enter job role: ");
        employee.setJobRole(scanner.nextLine());

        System.out.print("Enter performance history: ");
        employee.setPerformanceHistory(scanner.nextLine());

        employees.add(employee);

        System.out.println("Employee added successfully!\n");
    }

    public void viewEmployeeDetails() {

        System.out.println("Employee Details:");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Contact Information: " + employee.getContactInformation());
            System.out.println("Job Role: " + employee.getJobRole());
            System.out.println("Performance History: " + employee.getPerformanceHistory());
            System.out.println("------------------------");
        }
    }
    
  

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);  
}

class PayrollSystem {
    // Implement methods to calculate payroll, tax deductions, and benefits administration
}

class AttendanceSystem {
    // Implement methods to track employee attendance and working hours
}

class LeaveManagement {
    // Implement methods to manage vacation requests, sick leave, and other time-off policies
}
}
