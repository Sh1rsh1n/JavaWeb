package shirshin.homework_3;

import shirshin.homework_3.pojo.Employee;
import shirshin.homework_3.pojo.comparators.EmployeeAgeComparator;
import shirshin.homework_3.pojo.comparators.EmployeeSalaryComparator;
import shirshin.homework_3.pojo.positions.Developer;
import shirshin.homework_3.pojo.positions.Engineer;
import shirshin.homework_3.pojo.positions.Manager;

import java.util.Arrays;
import java.util.Comparator;

public class MainApp {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Ivan", "Popov", new Manager("PM"), "+79876543210", 29);
        Employee employee2 = new Employee("Petr", "Smirnov", new Developer("JavaDeveloper"), "+79876543211", 21);
        Employee employee3 = new Employee("Kirill", "Ivanov", new Developer("PythonDeveloper"), "+79876543215", 22);
        Employee employee4 = new Employee("Alexey", "Kuznecov", new Engineer("SoftwareEngineer"), "+79876543217", 22);
        Employee employee5 = new Employee("Masha", "Ivanova", new Developer("C#Developer"), "+79876543219", 29);

        Employee[] employees = new Employee[] {employee1, employee2, employee3, employee4, employee5};

        System.out.println("Before salary up");
        Arrays.stream(employees).forEach(System.out::println);

        for (Employee emp: employees) {
            Manager.salaryUp(emp, 500, true);
        }

        System.out.println("After salary up");
        Arrays.stream(employees).forEach(System.out::println);

        System.out.println("After sorting");
        Comparator<Employee> comparator = new EmployeeAgeComparator().thenComparing(new EmployeeSalaryComparator());
        Arrays.stream(employees).sorted(comparator).forEach(System.out::println);

    }
}
