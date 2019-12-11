
public class Employee1 
{
 String empName;
 int empId;
public Employee1(String empName, int empId) {
	super();
	this.empName = empName;
	this.empId = empId;
}

 public boolean equals(Object obj)
 {
	 Employee1 e1=(Employee1)obj;
	 if(e1.empId==this.empId)
	 {
		 if(e1.empName.equals(this.empName))
			 return true;
		 else
			 return false;
		 
	 }
	 
	 else
		 return false;
 }
}
