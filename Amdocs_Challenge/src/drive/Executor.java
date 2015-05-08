package drive;

import java.io.BufferedReader;
import java.io.FileReader;

public class Executor {
	Car car = null;
	
	public void ReadInputFile(String filename)
	{
		try(BufferedReader br = new BufferedReader(new FileReader("data/" + filename))) {
	        String line = br.readLine();
	        car = ProcessInput(line, car);
	        while (line != null && !line.isEmpty() ) {
	            line = br.readLine();
		        car = ProcessInput(line, car);
	        }
		}
		catch(Exception e)
		{
			System.out.println("Reached the end of the input file.");
		}
		
	}
	
	public Car ProcessInput(String data, Car car)
	{
		
		if (data.contains("INIT"))
		{
			String arguments = data.split("INIT")[1].trim();
			String direction = arguments.split(",")[2];
			int x = Integer.parseInt(arguments.split(",")[0]);
			int y = Integer.parseInt(arguments.split(",")[1]);
			car = Drive.Init(x, y, direction);
		}
		else if (data.contains("FORWARD"))
		{
			car = Drive.Forward(car);
		}
		else if (data.contains("TURN_LEFT"))
		{
			car = Drive.TurnLeft(car);
		}
		else if (data.contains("TURN_RIGHT"))
		{
			car = Drive.TurnRight(car);
		}
		else if (data.contains("GPS_REPORT"))
		{
			Drive.GPS_REPORT(car);
		}
		
		return car;
	}
}
