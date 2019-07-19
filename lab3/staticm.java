import java.util.*;
public class staticm
{
	static int i;
	int q=222;
	static String j;
	static
	{
				i=100;
				j="in static block";
			//	System.out.println(q);
				staticMethods s1=new staticMethods();
				System.out.println("static block with static method =");
				s1.count();
			staticMethods.count();
				s1.show();

	}
	public static void main(String args[])
	{

			staticMethods s=new staticMethods();
			//s.count(); //call by object
			staticMethods.count(); //call by class name
			//s.show(); //non satic method
			System.out.println("Static block = "+i);
			System.out.println("Static block = "+j);
	}
}
class staticMethods
{
		int a=12;
		static int i;
		public static void count()
		{
			//System.out.println("Non static variBLE= "+a);
			i++;
			System.out.println("Static variable = "+i);
		}
		public void show()
		{
				System.out.println("Static variable= "+i);
				System.out.println("Instance Variable ="+a);
		}
}