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

        // создаем работников
        Employee employee1 = new Employee("Ivan", "Popov", new Manager("Project"), "+79876543210", 29);
        Employee employee2 = new Employee("Petr", "Smirnov", new Developer("Java"), "+79876543211", 21);
        Employee employee3 = new Employee("Kirill", "Ivanov", new Developer("Python"), "+79876543215", 22);
        Employee employee4 = new Employee("Alexey", "Kuznecov", new Engineer("Software"), "+79876543217", 22);
        Employee employee5 = new Employee("Masha", "Ivanova", new Developer("C#"), "+79876543219", 29);

        // добавляем их в массив
        Employee[] employees = new Employee[] {employee1, employee2, employee3, employee4, employee5};

        System.out.println("\nМассив до повышения зарплаты\n");
        Arrays.stream(employees).forEach(System.out::println);

        // повышаем зарплату работникам
        for (Employee emp: employees) {
            Manager.salaryUp(emp, 500, false); // кроме менеджеров (addSalaryToManager = false)
        }

        System.out.println("\nМассив после повышения зарплаты\n");
        Arrays.stream(employees).forEach(System.out::println);


        System.out.println("\nМассив после сортировки\n");
        /*
         * создаем объект Comparator<Employee> и передаем в него как мы хотим сортировать всех работников
         * EmployeeAgeComparator - в начале по возрасту
         * EmployeeSalaryComparator - затем по зарплате
         * для наглядности возраст некоторых работников одинаковый
         */
        Comparator<Employee> comparator = new EmployeeAgeComparator().thenComparing(new EmployeeSalaryComparator());

        // сортируем массив и выводим результат сортировки
        Arrays.stream(employees).sorted(comparator).forEach(System.out::println);

    }
}
