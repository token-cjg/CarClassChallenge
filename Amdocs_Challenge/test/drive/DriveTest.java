package drive;

import static org.junit.Assert.*;

import org.junit.Test;

public class DriveTest {
	Car car = null;
	
	// initialisation tests
	
	@Test
	public void testInitDirection()
	{
		car = Drive.Init(1, 3, "SOUTH");
		assertEquals("SOUTH", car.Direction);
	}
	
	@Test
	public void testInitX()
	{
		car = Drive.Init(4, 2, "EAST");
		assertEquals(4, car.X);
	}
	
	@Test
	public void testInitY()
	{
		car = Drive.Init(5, 4, "WEST");
		assertEquals(4, car.Y);
	}
	
	// steering tests

	@Test
	public void testForwardNorth()
	{
		car = Drive.Init(1, 1, "NORTH");
		assertEquals(2, Drive.Forward(car).Y);
	}
	
	@Test
	public void testForwardWest()
	{
		car = Drive.Init(4, 1, "WEST");
		assertEquals(3, Drive.Forward(car).X);
	}
	@Test
	public void testForwardSouth()
	{
		car = Drive.Init(1, 5, "SOUTH");
		assertEquals(4, Drive.Forward(car).Y);
	}
	@Test
	public void testForwardEast()
	{
		car = Drive.Init(3, 2, "EAST");
		assertEquals(4, Drive.Forward(car).X);
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
	
	// boundary tests
	
	@Test
	public void testForwardAtBoundaryEast()
	{
		car = Drive.Init(5, 4, "EAST");
		assertEquals(5, Drive.Forward(car).X);
	}
	
	@Test
	public void testForwardAtBoundarySouth()
	{
		car = Drive.Init(3, 1, "SOUTH");
		assertEquals(1, Drive.Forward(car).Y);
	}
	
	@Test
	public void testForwardAtBoundaryWest()
	{
		car = Drive.Init(1, 1, "WEST");
		assertEquals(1, Drive.Forward(car).X);
	}
	
	@Test
	public void testForwardAtBoundaryNorth()
	{
		car = Drive.Init(3, 5, "NORTH");
		assertEquals(5, Drive.Forward(car).Y);
	}
}
