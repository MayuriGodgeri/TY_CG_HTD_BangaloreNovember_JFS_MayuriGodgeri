package customchecked;

public class AgeLimitException extends Exception
{
 String msg="age should be more than 18";

public AgeLimitException() {
	
}
 public String getMessage()
 {
	 return msg;
 }
}
