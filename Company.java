public class Company {
    public static void main(String[] args) {
        Employee[] Employees = new Employee[5];

        Employees[0] = new Employee("Jan Kowalski", 7600);
        Employees[1] = new Employee("Kamil Noski", 3000);
        Employees[2] = new Employee("Tadeusz Lej", 4500);
        Employees[3] = new Employee("Robert Walny", 5000);
        Employees[4] = new Employee("Krystian Wąski", 6000);

        System.out.println("Imię i nazwisko pracownika oraz jego pensja");
        System.out.println("Employee:" + Employees[3]);

        Employees[3].setSalary(9400);

        for (Employee employee : Employees) {
            System.out.println(employee);
        }
    }
}
