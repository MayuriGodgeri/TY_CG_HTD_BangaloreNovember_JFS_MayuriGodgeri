package PACK;

public class mobile 
{
	
 battery b1=new battery();
 
  
 void watching_video()
 {
	 System.out.println("watching video battery capacity reduces,Mobile is using battery capacity");
	
	 b1.discharge();
	 
 }
 
 void calling()
 {

	 System.out.println("calling battery capacity reduces,Mobile is using battery capacity");
	
	 b1.discharge();
 }
 void plug()
 {

	 System.out.println("Plug in to power increases battery capacity,Mobile is not using battery capacity");
	
	 b1.charge();
 } 
 }
