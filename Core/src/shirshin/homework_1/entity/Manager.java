package shirshin.homework_1.entity;

public class Manager extends Employee {
	
	public Manager(String name, String surname, String department, int phone) {
		super(name, surname, department, phone);
	}
	
	public void action() {
		System.out.println("Руководит коллективом.");
	}
}