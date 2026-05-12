abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculateSalary();

    void displayDetails() {
        System.out.println("ID: " + id + " | Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Full-Time Salary: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        System.out.println("Part-Time Salary: " + (hourlyRate * hoursWorked));
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee("Alice", 101, 5000);
        PartTimeEmployee pt = new PartTimeEmployee("Bob", 102, 20, 80);

        ft.displayDetails();
        ft.calculateSalary();

        pt.displayDetails();
        pt.calculateSalary();
    }
}