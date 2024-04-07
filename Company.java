import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] Employees = new Employee[5];

        Employee[0] = new Employee("Jan Kowalski", 7600);
        Employee[1] = new Employee("Kamil Noski", 3000);
        Employee[2] = new Employee("Tadeusz Lej", 4500);
        Employee[3] = new Employee("Robert Walny", 5000);
        Employee[4] = new Employee("Krystian Wąski", 6000);

        System.out.println("Imię i nazwisko pracownika oraz jego pensja");
        System.out.println("Employee:" + Employees[3])

        Employees[3].setSalary(9400)

        for (Employee employee : Employees) {
            System.out.println(employee);
        }
    }
}