package shirshin.homework_3.pojo;

import shirshin.homework_3.pojo.positions.Developer;
import shirshin.homework_3.pojo.positions.Engineer;
import shirshin.homework_3.pojo.positions.Manager;
import shirshin.homework_3.pojo.positions.Position;

public class Employee {

    private String name;
    private String surname;
    private Position position;
    private String phone;
    private int age;
    private int salary;

    public Employee(String name, String surname, Position position, String phone, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.phone = phone;
        this.age = age;
        this.salary = startSalary(); // начальная зарплата работника определяется в методе startSalary() в зависимости от должности
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position=" + position +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    /*
    * стартовая зарплата сотрудника
     */
    private int startSalary() {
        if (position instanceof Manager)
            return 1500;
        if (position instanceof Developer)
            return 2000;
        if (position instanceof Engineer)
            return 1300;
        return salary;
    }

}
