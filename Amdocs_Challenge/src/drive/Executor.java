package drive;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Executor {
	Car car = null;
	
	public void ReadInputFile(String filepath)
	{
		try(BufferedReader br = new BufferedReader(new FileReader(filepath))) {
	        String line = br.readLine();
	        car = ProcessInput(line, car);
	        while (line != null) {
	            line = br.readLine();
		        if (line != null)
		        	car = ProcessInput(line, car);
	        }
		}
	    catch (FileNotFoundException fnfe)
	    {
	        System.out.println("File not found exception: " + fnfe.toString());
	    }
	    catch (IOException ioe)
	    {
	        System.out.println("I/O exception: " + ioe.toString());
	    }
		
	}
	
	public Car ProcessInput(String data, Car car)
	{
		
		if (data.contains("INIT"))
		{
			String arguments = data.split("INIT")[1].trim();
			String direction = arguments.split(",")[2];
			int D = Direction.valueOf(direction).DirIndex();
			int x = Integer.parseInt(arguments.split(",")[0]);
			int y = Integer.parseInt(arguments.split(",")[1]);
			car = Drive.Init(x, y, D);
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
