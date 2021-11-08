package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeSorting {
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(101,"Employee1",12000));
		emp.add(new Employee(102,"Employee2",13000));
		emp.add(new Employee(103,"Employee3",14000));
		emp.add(new Employee(104,"Employee4",15000));
		emp.add(new Employee(105,"Employee5",16000));
			
		
		Set<String> sal = emp.stream().filter(element -> element.eSalary<15000)
				.map(element->element.eName)
				.collect(Collectors.toSet());
				System.out.println(sal);
				
		
	}
}

class Employee {
	 int eid;
	 String eName;
	 double eSalary;

	public Employee(int eid, String eName, double eSalary) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.eSalary = eSalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

}