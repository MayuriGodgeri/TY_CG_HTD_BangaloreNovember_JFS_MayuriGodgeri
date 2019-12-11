
public class Student 
{
 String studName;
 int studId;
public Student(String studName, int studId) {
	super();
	this.studName = studName;
	this.studId = studId;
}
  public String toString()
  {
	  return "Student name is "+studName + " with Id "+studId;
  }
 
}
