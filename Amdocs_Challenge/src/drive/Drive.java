package drive;
public class Drive {

	public static Car Init(int x, int y, int dirIndex)
	{
		Car car = new Car(x, y, dirIndex);
		return car;
	}
	
	public static Car Forward(Car car)
	{
		int dirIndex = car.D;

		if (dirIndex % 4 == 0 && car.Y != 5)  //north
		{
			car.Y += 1;
		}
		else if (dirIndex % 4 == 2 && car.Y != 1) //south
		{
			car.Y -= 1;
		}
		else if (dirIndex % 4 == 1 && car.X != 1) //west
		{
			car.X -= 1;
		}
		else if (dirIndex % 4 == 3 && car.X != 5) //east
		{
			car.X += 1;
		}
		return car;
	}
	
	public static Car TurnLeft(Car car)
	{
		car.D += 1;
		car.D %= 4;
		return car;
	}
	
	public static Car TurnRight(Car car)
	{
		car.D -= 1;
	    car.D %= 4;
		return car;
	}
	
	public static void GPS_REPORT(Car car)
	{
		System.out.println("Output: " + car.X + "," + car.Y + "," + Direction.values()[car.D]);
	}
}
