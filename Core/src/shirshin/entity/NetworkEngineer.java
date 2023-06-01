package shirshin.entity;

public class NetworkEngineer extends Employee {
	
	public NetworkEngineer(String name, String surname, String department, int phone) {
		super(name, surname, department, phone);
	}
	
	public void action() {
		System.out.println("Настройка компьютерной сети компании.");
	}
	
}