package shirshin.entity;

public class JavaDeveloper extends Employee {
	
	public JavaDeveloper(String name, String surname, String department, int phone) {
		super(name, surname, department, phone);
	}
	
	public void action() {
		System.out.println("Разрабатывает приложения. Пишет код на ЯП Java.");
	}
}