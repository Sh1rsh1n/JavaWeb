package shirshin.homework_3.pojo.comparators;

import shirshin.homework_3.pojo.Employee;

import java.util.Comparator;

/*
 * класс-компаратор, который определяет сортировку по зарплате работника
 */
public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() - o2.getSalary();
    }
}
