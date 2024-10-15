import java.util.ArrayList;

abstract class Employee {
	private String name;
	private int uniqueId;

	public Employee(String name, int uniqueId){
		this.name = name;
		this.uniqueId = uniqueId;
	}
	public String getName(){
		return name;
	}
	public int getUniqueId(){
		return uniqueId;
	}
	public abstract double calculateSalary();

	@Override
	public String toString(){
		return "Employee[Name: " + name + ", Unique ID: " + uniqueId  + ", Salary: " + calculateSalary() +"] ";
	}
}

class fulltimeEmployee extends Employee {
	private double salary;

	public fulltimeEmployee(String name, int uniqueId, double salary){
		super(name, uniqueId);
		this.salary = salary;
	}
	@Override
	public double calculateSalary(){
		return salary;
	}
}
class parttimeEmployee extends Employee {
	private double hourlywage;
	private int hoursWorked;

	public parttimeEmployee(String name, int uniqueId, double hourlywage, int hoursWorked){
		super(name, uniqueId);
		this.hourlywage = hourlywage;
		this.hoursWorked = hoursWorked;
	}
	@Override
	public double calculateSalary(){
		return hourlywage * hoursWorked;
	}
}
class Payroll {
	private ArrayList<Employee> employees;

	public Payroll() {
		employees = new ArrayList<Employee>();
	}

	public void addEmployee(Employee e) {
		employees.add(e);
	}

	public void removeEmployee(int uniqueId) {
		Employee employee_remove = null;
		for (Employee e : employees) {
			if (e.getUniqueId() == uniqueId) {
				employee_remove = e;
				break;
			}
		}
			if (employee_remove != null) {
				employees.remove(employee_remove);
			}

		}

	public void printPayroll() {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	public double totalSalary() {
		double total = 0;
		for (Employee employee : employees) {
			total += employee.calculateSalary();
		}
		return total;
	}

}
public class Main {
	public static void main(String[] args) {
		Payroll payroll = new Payroll();
		payroll.addEmployee(new fulltimeEmployee("Yashwant", 1, 50000));
		parttimeEmployee emp1 = new parttimeEmployee("Raj", 2, 100, 100);
		payroll.addEmployee(emp1);
		System.out.println("Employee List: ");
		payroll.printPayroll();
		System.out.println("Total Salary Paid: " + payroll.totalSalary());

		payroll.removeEmployee(2);
		System.out.println("New Employee List: ");
		payroll.printPayroll();
		System.out.println("Total Salary Paid: " + payroll.totalSalary());
	}
}
