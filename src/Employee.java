public class Employee {
    public static final String DEPARTMENT = "Development";
    int age;
    String designation;
    private static double salary;
    public String name;

    public Employee(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public static void main(String args[]) {
        salary = 4500;
        System.out.println(DEPARTMENT + " average salary: " + salary);
    }

    public void setSalary(double salary) {
        Employee.salary = salary;
    }

    public void printEmployee() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: " + salary);
    }
}
