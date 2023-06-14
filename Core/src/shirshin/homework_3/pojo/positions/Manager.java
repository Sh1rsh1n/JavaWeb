package shirshin.homework_3.pojo.positions;

import shirshin.homework_3.pojo.Employee;

public class Manager extends Position {

    public Manager(String title) {
        super(title);
    }

    /*
    * метод, повышает зарплату сотрудникам
    * @employee - сотрудник
    * @addSalary - добавляемая зарплата
    * @addSalaryToManager - оставим возможность повысить зарплату менеджеру
     */
    public static void salaryUp(Employee employee, int addSalary, boolean addSalaryToManager) {
        if (addSalaryToManager) { // добавляем зарплату менеджерам
            employee.setSalary(employee.getSalary() + addSalary);
            return;
        }
        if (!(employee.getPosition() instanceof Manager)) { // добавляем зарплату другим сотрудникам
            employee.setSalary(employee.getSalary() + addSalary);
        }
    }
}
