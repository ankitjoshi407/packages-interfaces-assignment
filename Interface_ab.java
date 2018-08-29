import java.util.Scanner;
interface Animal
{
	void speak();
	void eat();
}
class dog implements Animal
{
	public void speak()
	{
		System.out.println(" Dog Bark");
	}
	public void eat()
	{
		System.out.println(" Dog eating bones ");
	}
	
}
class cat implements Animal
{
	
	   public void speak()
	{
		System.out.println(" MEOW ");
	}
	public void eat()
	{
		System.out.println(" Cat eating food");
	}
}
class Interface_ab
{
	public static void main(String ar[])
	{
		
		dog d=new dog();
		cat c=new cat();
		d.speak();
		d.eat();
		c.speak();
		c.eat();
	}
}