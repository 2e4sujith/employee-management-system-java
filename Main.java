import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = null;
        int choice;

        do {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Update Department");
            System.out.println("4. Show Employee Count");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Employee ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Department: ");
                    String dept = sc.nextLine();

                    emp = new Employee(id, name, age, dept);

                    System.out.println("Employee Added Successfully!");

                    break;

                case 2:

                    if (emp != null) {

                        // Polymorphism
                        Person p = emp;
                        p.displayDetails();

                    } else {

                        System.out.println("No Employee Found!");
                    }

                    break;

                case 3:

                    if (emp != null) {

                        sc.nextLine();

                        System.out.print("Enter New Department: ");
                        String newDept = sc.nextLine();

                        emp.updateDepartment(newDept, true);

                    } else {

                        System.out.println("No Employee Found!");
                    }

                    break;

                case 4:

                    System.out.println("Total Employees: "
                            + Employee.getEmployeeCount());

                    break;

                case 5:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}