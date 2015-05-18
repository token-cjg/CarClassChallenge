package drive;

import static org.junit.Assert.*;

import org.junit.Test;

public class DriveTest {
	Car car = null;
	
	// initialisation tests
	
	@Test
	public void testInitDirection()
	{
		car = Drive.Init(1, 3, 2);
		assertEquals(2, car.D);
	}
	
	@Test
	public void testInitX()
	{
		car = Drive.Init(4, 2, 3);
		assertEquals(4, car.X);
	}
	
	@Test
	public void testInitY()
	{
		car = Drive.Init(5, 4, 1);
		assertEquals(4, car.Y);
	}
	
	// steering tests

	@Test
	public void testForwardNorth()
	{
		car = Drive.Init(1, 1, 0);
		assertEquals(2, Drive.Forward(car).Y);
	}
	
	@Test
	public void testForwardWest()
	{
		car = Drive.Init(4, 1, 1);
		assertEquals(3, Drive.Forward(car).X);
	}
	@Test
	public void testForwardSouth()
	{
		car = Drive.Init(1, 5, 2);
		assertEquals(4, Drive.Forward(car).Y);
	}
	@Test
	public void testForwardEast()
	{
		car = Drive.Init(3, 2, 3);
		assertEquals(4, Drive.Forward(car).X);
	}
	
	@Test
	public void testTurnLeft()
	{
		car = Drive.Init(3, 5, 1);
		assertEquals(2, Drive.TurnLeft(car).D);
	}
	
	@Test
	public void testTurnRight()
	{
		car = Drive.Init(2, 4, 0);
		assertEquals(-1, Drive.TurnRight(car).D);
	}
	
	// boundary tests
	
	@Test
	public void testForwardAtBoundaryEast()
	{
		car = Drive.Init(5, 4, 3);
		assertEquals(5, Drive.Forward(car).X);
	}
	
	@Test
	public void testForwardAtBoundarySouth()
	{
		car = Drive.Init(3, 1, 2);
		assertEquals(1, Drive.Forward(car).Y);
	}
	
	@Test
	public void testForwardAtBoundaryWest()
	{
		car = Drive.Init(1, 1, 1);
		assertEquals(1, Drive.Forward(car).X);
	}
	
	@Test
	public void testForwardAtBoundaryNorth()
	{
		car = Drive.Init(3, 5, 0);
		assertEquals(5, Drive.Forward(car).Y);
	}
}
