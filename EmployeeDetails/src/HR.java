
public class HR {
	private float salary;
	public float hike=0.1f;
	public HR(int salary) {
		this.salary=salary;
	}
	public void calculateSalary(){
		this.salary= salary * hike;
		System.out.println("Salary : "+this.salary);
	}

}
