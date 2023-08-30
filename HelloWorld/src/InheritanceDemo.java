
class Vehicle
{
	int wheels;
	Vehicle()
	{
		System.out.println("Default Constructor");
	}
	public Vehicle(int wheels)
	{
		if(wheels == 2)
		{
			System.out.println("Two Wheeler");
		}
		else if(wheels == 4)
		{
			System.out.println("Four Wheeler");
		}
		else 
		{
			System.out.println("Not Applicable");
		}
	}
	public void printVehicle()
	{
		System.out.println("Vehicle - Print Method");
	}
}
class Bike extends Vehicle
{
	
}
class Car extends Vehicle
{
	Car()
	{
		System.out.println("Car Class Constructor");
	}
	Car(int wheels)
	{
		super(wheels);//invoking Vehicle's Constructor.
	}
	public void print()
	{
		System.out.println("Car Class - Print Method");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car(24);
		c.printVehicle();
		c.print();
	}

}
