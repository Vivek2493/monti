package comparator;


public class Employee implements Comparable<Employee> {
	
	private int eid;
	private String ename;
	
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if(this.getEname().compareTo(o.getEname())<0)
			return -1;
		else if(this.getEname().compareTo(o.getEname())>0)
			return 1;
		else
			return 0;
	}
}