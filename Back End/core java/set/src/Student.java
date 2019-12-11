
public class Student implements Comparable<Student>
{
 int age;
 String name;
public Student(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}
@Override
public String toString() {
	return "Student [age=" + age + ", name=" + name + "]";
}
//@Override
//SORTING BASED ON AGE....
//public int compareTo(Student o) {
	//if(this.age>o.age) 
	//{
	//return 1;
	//}
	//else if(this.age<o.age)
	//{
	//	return -1;
	//}
	//else
	//{
		//return 0;
	//}
//}
@Override
//SORTING BASED ON NAMES......
public int compareTo(Student o) 
{
	return this.name.compareTo(o.name);
		
	
}
 

}
