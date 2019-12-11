package customuncheckedexcep;

public class ATMSimulator
{ 
	void withrow(double amt)
	{
		
		if(amt>40000)
		
			throw new DayLimitException("user has exceeded day limit");
		
	}
}
