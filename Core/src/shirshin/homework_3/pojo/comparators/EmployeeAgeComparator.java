package shirshin.homework_3.pojo.comparators;

import shirshin.homework_3.pojo.Employee;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}
