/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class LE0
{
      int age;
	 String name;
	 void set_age(int age)
	{
	    this.age=age;
	}
	
	 void set_name(String name)
	{
	    this.name=name;
	}
	
	String get_name()
	{
	    return this.name;
	}
	int get_age()
	{
	    return this.age;
	}
	
	
	public static void main(String[] args) {
	    
	    Juet obj1=new Juet();
	    obj1.set_name("Divyanshi");
	    obj1.set_age(20);
	    System.out.println("Name: "+obj1.get_name());
	    System.out.println("Age: "+obj1.get_age());
	    
	}

}