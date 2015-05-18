package drive;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarTest {
	Car car = null;
	// initialisation tests
	
	@Test
	public void testBuildDirection()
	{
		car = new Car(1, 3, 2);
		assertEquals(2 % 4, car.D);
	}
	
	@Test
	public void testBuildX()
	{
		car = new Car(4, 2, 3);
		assertEquals(4, car.X);
	}
	
	@Test
	public void testBuildY()
	{
		car = new Car(5, 4, 1);
		assertEquals(4, car.Y);
	}
	
}
