import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Jan Kowalski", 2000, 0);
        employees[1] = new Worker("Kamil Noski", 60000, "CEO");
        employees[2] = new Employee("Robert Walny", 5000);
        employees[3] = new Worker("Tadeusz Lej", 6000, "Sale");
        employees[4] = new Worker("Krystian Waski", 3000, "Cashier");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
