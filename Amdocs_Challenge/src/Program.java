import java.io.BufferedReader;
import java.io.FileReader;


public class Program {
	public static Car car = null;
	
	public static void main(String [] args)
	{
		ReadInputFile("input.txt");
	}
	
	public static void ReadInputFile(String filename)
	{
		try(BufferedReader br = new BufferedReader(new FileReader("../data/" + filename))) {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();
	        
	        ProcessInput(line, car);
	        
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void ProcessInput(String data, Car car)
	{
		
		if (data.contains("INIT"))
		{
			String arguments = data.split("INIT")[1];
			String direction = arguments.split(",")[2];
			int x = Integer.parseInt(arguments.split(",")[0]);
			int y = Integer.parseInt(arguments.split(",")[1]);
			car = Drive.Init(x, y, direction);
		}
		else if (data == "FORWARD")
		{
			car = Drive.Forward(car);
		}
		else if (data == "TURN_LEFT")
		{
			car = Drive.TurnLeft(car);
		}
		else if (data == "TURN_RIGHT")
		{
			car = Drive.TurnRight(car);
		}
		else if (data == "GPS_REPORT")
		{
			Drive.GPS_REPORT(car);
		}
	}
}
