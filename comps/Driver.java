package comps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
	
	
	public static void main(String[] args) {
		
		//temporary object to call helper methods
		Employee tempObj = new Employee();			
		
		//List of type Employee
		List<Employee> list = new ArrayList<>();	
		
		//adding objects to list
		list.add(new Employee(5,"Mango",20000,22));
		list.add(new Employee(2,"Apple",60000,21));
		list.add(new Employee(6,"Litchi",60000,23));
		list.add(new Employee(3,"Banana",40000,22));
		list.add(new Employee(1,"Kiwi",25000,24));
		list.add(new Employee(4,"Papaya",30000,22));
		
		System.out.println("Before Sorting::");
		displayList(list);
		
		//Default(Name) sorting using comparable(Original Employee Class)
		Collections.sort(list); 
		System.out.println("\nAfter Default Sorting::(sorts by name)");
		displayList(list);
		
		//custom sorting using Comparator(AgeComparator)
		tempObj.sortByAge(list);	
		System.out.println("\nAfter Sorting by Age::");
		displayList(list);
		
		//custom sorting using Comparator(SalaryComparator)
		tempObj.sortBySalary(list);	
		System.out.println("\nAfter Sorting by Salary::");
		displayList(list);
		
		//custom sorting using Comparator(IdComparator)
		tempObj.sortById(list);	
		System.out.println("\nAfter Sorting by ID::");
		displayList(list);
		
	}
	
	//displays list
	public static void displayList(List<Employee> list)
	{
		for(Employee e : list)
		{
			System.out.println(e);
		}
	}

}
