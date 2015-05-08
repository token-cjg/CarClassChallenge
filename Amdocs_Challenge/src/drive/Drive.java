package drive;
public class Drive {

	public static Car Init(int x, int y, String direction)
	{
		Car car = new Car(x, y, direction);
		return car;
	}
	
	public static Car Forward(Car car)
	{
		String direction = car.Direction;

		if (direction.equals("NORTH") && car.Y != 5)
		{
			car.Y += 1;
		}
		else if (direction.equals("SOUTH") && car.Y != 1)
		{
			car.Y -= 1;
		}
		else if (direction.equals("WEST") && car.X != 1)
		{
			car.X -= 1;
		}
		else if (direction.equals("EAST") && car.X != 5)
		{
			car.X += 1;
		}
		return car;
	}
	
	public static Car TurnLeft(Car car)
	{
		String direction = car.Direction;
		
		if (direction.equals("NORTH"))
		{
			car.Direction = "WEST";
		}
		else if (direction.equals("WEST"))
		{
			car.Direction = "SOUTH";
		}
		else if (direction.equals("SOUTH"))
		{
			car.Direction = "EAST";
		}
		else if (direction.equals("EAST"))
		{
			car.Direction = "NORTH";
		}
		return car;
	}
	
	public static Car TurnRight(Car car)
	{
		String direction = car.Direction;
		
		if (direction.equals("NORTH"))
		{
			car.Direction = "EAST";
		}
		else if (direction.equals("EAST"))
		{
			car.Direction = "SOUTH";
		}
		else if (direction.equals("SOUTH"))
		{
			car.Direction = "WEST";
		}
		else if (direction.equals("WEST"))
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
