package customuncheckedexcep;

public class SBIatm
{
public static void main(String[] args)
{
	System.out.println("main started");
	ATMSimulator a=new ATMSimulator();
	try {
	a.withrow(41000);
	}
catch(DayLimitException e) {
	System.out.println(e.getMessage());
}
	System.out.println("main ended");
}
}
