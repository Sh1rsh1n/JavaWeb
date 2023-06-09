package shirshin.homework_1;

import shirshin.homework_1.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Основной класс, для запуска приложения
 */
public class MainApp {

	/*
	 * метод main, точка входа в приложение
	 */
	public static void main(String[] args) {
		
		Employee emp1 = new JavaDeveloper("Pavel", "Ivanov", "IT", 101);
		Employee emp2 = new JavaDeveloper("Anna", "Petrova", "IT", 101);
		Employee emp3 = new NetworkEngineer("Egor", "Sidorov", "IT", 102);
		Employee emp4 = new Manager("Kirill", "Kozlov", "Direction", 201);
		Employee emp5 = new HR("Nina", "Kireeva", "PR", 301);
		
		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		for (Employee employee : list){
			System.out.println(employee.getName());
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите имя работника, о котором нужно получить информацию:");
		String name = scanner.nextLine();
		
		for (Employee employee : list){
			if (name.equals(employee.getName())) {
				employee.showInfo();
				employee.action();
				return;
			} 
		}
		
		System.out.println("Нет такого сотрудника");
		
	}
}