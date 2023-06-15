package shirshin.homework_3.pojo.positions;

import shirshin.homework_3.pojo.Employee;

public class Manager extends Position {

    public Manager(String title) {
        super(title + "Manager");
    }

    /*
     * метод, повышает зарплату работникам
     * чтобы повысить зарплату работнику с должностью менеджер, нужно передать true в параметр addSalaryToManager
     */
    public static void salaryUp(Employee employee, int addSalary, boolean addSalaryToManager) {
        // добавляем зарплату менеджерам
        if (addSalaryToManager && employee.getPosition() instanceof Manager) {
            employee.setSalary(employee.getSalary() + addSalary);
        }
        // добавляем зарплату другим сотрудникам
        if (!(employee.getPosition() instanceof Manager)) {
            employee.setSalary(employee.getSalary() + addSalary);
        }
    }
}
