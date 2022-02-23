import java.util.ArrayList;
import java.util.Iterator;

class EmployeeDetails extends HR{
	public String name;
	public int id;
	public String address;
	static String ceo;
	
	
	public static void setCeo(String ceo) {
		EmployeeDetails.ceo = ceo;
	}
	public EmployeeDetails(String name, int id,String address,int salary ) {
		super(salary);
		this.name=name;
		this.id=id;
		this.address=address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<EmployeeDetails> det = new ArrayList<>();
		EmployeeDetails ceo = new EmployeeDetails("Rajesh",120,"USA",3000000);
		EmployeeDetails emp1 = new EmployeeDetails("Raj",121,"Dowleswaram",800000);
		EmployeeDetails emp2 = new EmployeeDetails("Hann",122,"UK",90292);
		ceo.setCeo("Rajesh");
		det.add(ceo);
		det.add(emp1);
		det.add(emp2);
		Iterator<EmployeeDetails> itr = det.iterator();
		while(itr.hasNext()) {
			EmployeeDetails str= itr.next();
			System.out.println("Name : "+str.name);
			System.out.println("ID number : "+str.id);
			System.out.println("Address : "+str.address);
			str.calculateSalary();
			System.out.println("CEO of the Company : "+str.ceo);
			System.out.println("-------------------------------");
		}

	}

}
