

public class Singleresp {
    public static void main(String[] args) {

        Employee emp = new Employee("Rahul", 30000);

        SalaryCalculator calculator = new SalaryCalculator();

        EmployeeReport report = new EmployeeReport();

        double totalSalary = calculator.calculateSalary(emp);

        System.out.println("Total Salary: " + totalSalary);

        report.generateReport(emp);
}
}

// srp breaks
// class Employee {

//     String name;
//     double salary;

//     // 1. Employee information
//     public void getEmployeeDetails() {
//         System.out.println(name);
//         System.out.println(salary);
//     }

//     // 2. Salary calculation
//     public double calculateSalary() {
//         return salary + 5000;
//     }

//     // 3. Report generation
//     public void generateReport() {
//         System.out.println("Employee Report");
//         System.out.println(name);
//         System.out.println(salary);
//     }



//good srp 

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class SalaryCalculator {

    public double calculateSalary(Employee emp) {

        return emp.getSalary() + 5000;

    }
}

class EmployeeReport {

    public void generateReport(Employee emp) {

        System.out.println("Employee Report");

        System.out.println("Name: " + emp.getName());

        System.out.println("Salary: " + emp.getSalary());

    }
}