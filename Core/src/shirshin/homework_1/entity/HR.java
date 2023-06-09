package shirshin.homework_1.entity;

/*
 * Класс, HR наследует класс Employee
 * реализует метод action()
 */
public class HR extends Employee {
	
	public HR(String name, String surname, String department, int phone) {
		super(name, surname, department, phone);
	}

	public void action() {
		System.out.println("Поиск новых работников.");
	}
	
}