public class EmployeeTest {
    public static void main(String args[]) {
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        empOne.setAge(24);
        empOne.setDesignation("Software Engineer");
        empOne.setSalary(4000);
        empOne.printEmployee();

        empTwo.setAge(26);
        empTwo.setDesignation("Senior Software Engineer");
        empTwo.setSalary(6000);
        empTwo.printEmployee();
    }
}
