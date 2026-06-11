public class Employee extends Person {

    private int employeeId;
    private String department;

    private static int employeeCount = 0;

    public Employee() {
        employeeCount++;
    }

    public Employee(int employeeId) {
        this.employeeId = employeeId;
        employeeCount++;
    }

    public Employee(int employeeId, String name, int age, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
        employeeCount++;
    }

    public void updateDepartment(String dept) {
        department = dept;
    }

    public void updateDepartment(String dept, boolean printMessage) {
        department = dept;

        if (printMessage) {
            System.out.println("Department Updated Successfully");
        }
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Department: " + department);
    }
}