package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMain {
	
	public static void main(String[] args) {
		ArrayList<Employee> e=new ArrayList<>();
		
		e.add(new Employee(1,"abc"));
		e.add(new Employee(8,"def"));
		e.add(new Employee(4,"ghi"));
		e.add(new Employee(6,"jkl"));
		
		Collections.sort(e,new EmpComparator());
		
		System.out.println("this is sorted according to eid");
		for(Employee x : e)
			System.out.println(x);		
		
		Collections.sort(e);
		
		System.out.println("this is sorted according to ename");
		for(Employee x : e)
			System.out.println(x);	
	}
}
