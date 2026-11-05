package core;

public class Singleresp {

}

class Employee {

    String name;
    double salary;

    // 1. Employee information
    public void getEmployeeDetails() {
        System.out.println(name);
        System.out.println(salary);
    }

    // 2. Salary calculation
    public double calculateSalary() {
        return salary + 5000;
    }

    // 3. Report generation
    public void generateReport() {
        System.out.println("Employee Report");
        System.out.println(name);
        System.out.println(salary);
    }
}