package shirshin.homework_1.entity;

/*
 * Абстрактный класс, описание работника
 */
public abstract class Employee {

	protected String name;
	
	protected String surname;
	
	protected String department;
	
	protected int phone;
	
	public Employee(String name, String surname, String department, int phone){
		this.name = name;
		this.surname = surname;
		this.department = department;
		this.phone = phone;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	/*
	 * Метод, выводит информацию о работнике
	 */
	public void showInfo(){
	
		System.out.printf(
		"Информация о работнике: с" +
		"Имя: %s\n" +
		"Фамилия: %s\n" +
		"Должность: %s\n" +
		"Департамент: %s\n" +
		"Телефон: %d\n", name, surname, this.getClass().getSimpleName(), department, phone);
	}

	/*
	 * Астрактный метод, описание того что умеет делать работник
	 */
	public abstract void action();
	
}