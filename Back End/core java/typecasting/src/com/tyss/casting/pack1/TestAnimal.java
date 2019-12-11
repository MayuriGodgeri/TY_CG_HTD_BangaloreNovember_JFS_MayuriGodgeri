package com.tyss.casting.pack1;

public class TestAnimal 
{
public static void main(String[] args)
{
	Animal a=new Animal();
	a.eat();
	System.out.println("-----------");
	Animal a1=new Dog();
	a1.eat();
	
    Dog d= (Dog)a1;
    d.sleep();
    System.out.println("-----------");
    Animal a2=new Lion();
	a2.eat();
    Lion d1= (Lion)a2;
    d1.run();
    
    
}
}
