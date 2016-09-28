import java.util.Date; 
public class Employee {
	
	public String name;
	public String ssn; 
	public Double salary; 
	public Date hireDate;
	
	public Employee (String a, String b, Double c, Date d){
		
		name = a;
		ssn = b;
		salary = c;
		hireDate = d;
		
	}
	public String getName(){ //get name
		return name; //set name
	}
	public String getSsn(){ //get ssn
		return ssn; //set ssn
	}
	public Double getSalary(){ //get salary
		return salary; //set salary
	}
	public Date hireDate(){ //get hire date
		return hireDate; //set hire date
	}
	
}           


