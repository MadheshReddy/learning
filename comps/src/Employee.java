package comps;

import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
	
    private int id;
    private String name;
    private int salary;
    private int age;
    
    public Employee() {}
    
	public Employee(int id, String name, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		//
		return this.getName().compareTo(o.getName());
	}
    
	
	//helper methods
	
	public void sortByAge(List<Employee> list)
	{
		Collections.sort(list,new AgeComparator());
	}
	
	public void sortBySalary(List<Employee> list)
	{
		Collections.sort(list,new SalaryComparator());
	}
	
	public void sortById(List<Employee> list)
	{
		Collections.sort(list,new IdComparator());
	}
	
	
}

