package staticAndNonststic;

public class TestPhone 
{
	 public static void main(String arr[])
	 {
		 FirstGen fg=new FirstGen();
		 fg.call();
		 fg.msg();
		 SecGen sg=new SecGen();
		 sg.call();
		 sg.msg();
		 sg.radio();
		 ThirdGen tg=new ThirdGen();
		 tg.call();
		 tg.msg();
		 tg.radio();
		 tg.cam();
		 System.out.println("--------------------");
		 
		 FirstGen fg1=new ThirdGen();
		 fg1.call();
		 fg1.msg();
		 SecGen sg1=new SecGen();
		 sg1.call();
		 sg1.msg();
		 sg1.radio();
		 
	 }
}
