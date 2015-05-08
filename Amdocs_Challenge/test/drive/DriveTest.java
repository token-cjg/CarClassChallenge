package drive;

import static org.junit.Assert.*;

import org.junit.Test;

public class DriveTest {
	Car car = null;
	
	@Test
	public void testForwardFromNorth()
	{
		car = Drive.Init(0, 0, "NORTH");
		assertEquals(1, Drive.Forward(car).Y);
	}
	
	@Test
	public void testInitDirection()
	{
		car = Drive.Init(0, 3, "SOUTH");
		assertEquals("SOUTH", car.Direction);
	}
	
	@Test
	public void testInitX()
	{
		car = Drive.Init(4, 2, "EAST");
		assertEquals(4, car.X);
	}
	
	@Test
	public void testTurnLeft()
	{
		car = Drive.Init(3, 5, "WEST");
		assertEquals("SOUTH", Drive.TurnLeft(car).Direction);
	}
	
	@Test
	public void testTurnRight()
	{
		car = Drive.Init(2, 4, "NORTH");
		assertEquals("EAST", Drive.TurnRight(car).Direction);
	}
	
	@Test
	public void testForwardAtBoundaryEast()
	{
		car = Drive.Init(5, 4, "EAST");
		assertEquals(5, Drive.Forward(car).X);
	}
	
	@Test
	public void testForwardAtBoundarySouth()
	{
		car = Drive.Init(3, 0, "SOUTH");
		assertEquals(0, Drive.Forward(car).Y);
	}
}
