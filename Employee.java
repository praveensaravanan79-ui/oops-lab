import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    String empAddress;
    String mobileNo;
    String mailId;
    String designation;
    double basicPay;
    double grossSalary;
    double netSalary;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Address: ");
        empAddress = sc.nextLine();

        System.out.print("Enter Mail ID: ");
        mailId = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        mobileNo = sc.nextLine();

        System.out.print("Enter Basic Pay: ");
        basicPay = sc.nextDouble();

        System.out.println("\nChoose Designation");
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                designation = "Programmer";
                break;
            case 2:
                designation = "Assistant Professor";
                break;
            case 3:
                designation = "Associate Professor";
                break;
            case 4:
                designation = "Professor";
                break;
            case 5:
                System.out.println("Exiting Program...");
                System.exit(0);
                break;
            default:
                designation = "Not Assigned";
        }

        // Salary Calculation
        double hra = basicPay * 0.20;
        double da = basicPay * 0.10;
        grossSalary = basicPay + hra + da;

        double tax = grossSalary * 0.05;
        netSalary = grossSalary - tax;
    }

    void displayDetails() {
        System.out.println("\n========== Employee Details ==========");
        System.out.println("Employee Name    : " + empName);
        System.out.println("Employee ID      : " + empId);
        System.out.println("Employee Address : " + empAddress);
        System.out.println("Mail ID          : " + mailId);
        System.out.println("Phone Number     : " + mobileNo);
        System.out.println("Basic Pay        : " + basicPay);
        System.out.println("Gross Salary     : " + grossSalary);
        System.out.println("Net Salary       : " + netSalary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getDetails();
        emp.displayDetails();
    }
}
