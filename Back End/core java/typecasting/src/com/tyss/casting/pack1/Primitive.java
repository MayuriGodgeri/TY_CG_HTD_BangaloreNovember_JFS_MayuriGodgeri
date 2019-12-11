package com.tyss.casting.pack1;

public class Primitive
{
	//implicit typecasting
  byte b=4;
  short s=b;
  int i=b;
  float f=b;
  long l=b;
  void values()
  {
	  System.out.println("byte value is "+b);
	  System.out.println("short value is "+s);
	  System.out.println("float value is "+f);
	  System.out.println("int value is "+i);
	  System.out.println("long value is "+l);
  }
  //explicit typecasting
  double pi=3.14;
  int in=(int)pi;
  void value1()
  {
	  System.out.println("pi value is "+in);
  }
}
