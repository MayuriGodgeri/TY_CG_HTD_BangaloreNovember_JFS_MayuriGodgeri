package staticAndNonststic;

public class Branch 
{
  public static void main(String arrg[])
  {
	Qspiders btm=new Qspiders();
	btm.swipe();
	btm.swipe();
	
	Qspiders btr=new Qspiders();
	btr.swipe();
	btr.swipe();
	
	System.out.println(Qspiders.totalStudCount);
	System.out.println(btm.branchCount);
	System.out.println(btr.branchCount);
  }
}
