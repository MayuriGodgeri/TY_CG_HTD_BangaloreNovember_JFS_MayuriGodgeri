
public class Array3
{
	public static void main(String[] args) 
	{
		char a1[]=new char[4];
		a1[0]='M';
		a1[1]=3;    //converting into character value
		a1[2]='Y';
		a1[3]=100;     //converting into character value
		System.out.println(a1.length);
		for(int i=0;i<a1.length;i++)
			System.out.println(a1[i]);
	}
}
