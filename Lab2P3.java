class Employee {
    String name, lastName;
    double monthlySalary;

    Employee(String n, String l, double s) {
        name = n;
        lastName = l;
        if (s > 0) monthlySalary = s;
    }

    double yearlySalary() {
        return monthlySalary * 12;
    }

    void raise() {
        monthlySalary = monthlySalary + (monthlySalary * 0.10);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", "Patel", 20000);
        Employee e2 = new Employee("Rahul", "Shah", 30000);

        System.out.println(e1.yearlySalary());
        System.out.println(e2.yearlySalary());

        e1.raise();
        e2.raise();

        System.out.println(e1.yearlySalary());
        System.out.println(e2.yearlySalary());
    }
}
