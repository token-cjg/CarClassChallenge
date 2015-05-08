
public class Drive {

	public static Car Init(int x, int y, String direction)
	{
		Car car = new Car(x, y, direction);
		return car;
	}
	
	public static Car Forward(Car car)
	{
		String direction = car.Direction;
		
		if (direction == "NORTH" && car.Y != 5)
		{
			car.Y += 1;
		}
		else if (direction == "SOUTH" && car.Y != 0)
		{
			car.Y -= 1;
		}
		else if (direction == "WEST" && car.X != 0)
		{
			car.X -= 1;
		}
		else if (direction == "EAST" && car.X != 5)
		{
			car.X += 1;
		}
		return car;
	}
	
	public static Car TurnLeft(Car car)
	{
		String direction = car.Direction;
		
		if (direction == "NORTH")
		{
			car.Direction = "WEST";
		}
		else if (direction == "WEST")
		{
			car.Direction = "SOUTH";
		}
		else if (direction == "SOUTH")
		{
			car.Direction = "EAST";
		}
		else if (direction == "EAST")
		{
			car.Direction = "NORTH";
		}
		return car;
	}
	
	public static Car TurnRight(Car car)
	{
		String direction = car.Direction;
		
		if (direction == "NORTH")
		{
			car.Direction = "EAST";
		}
		else if (direction == "EAST")
		{
			car.Direction = "SOUTH";
		}
		else if (direction == "SOUTH")
		{
			car.Direction = "WEST";
		}
		else if (direction == "WEST")
		{
			car.Direction = "NORTH";
		}
		return car;
	}
	
	public static void GPS_REPORT(Car car)
	{
		System.out.println("Output: " + car.X + "," + car.Y + "," + car.Direction);
	}
}
