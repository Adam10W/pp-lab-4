import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Jan Kowalski", 50000, 0);
        employees[1] = new Worker("Kamil Noski", 60000, "CEO");
        employees[2] = new Employee("Sylwia Poznańska", 55000);
        employees[3] = new Worker("Tadeusz Lej", 65000, "Sale");
        employees[4] = new Worker("Krystian Waski", 70000, "Cashier");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
