/**
 * 
 */
package coffeeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coffeeOrder.Coffee;
import coffeeOrder.CoffeeBuilder;
import coffeeOrder.CoffeeBuilderImplementation;
import coffeeOrder.CoffeeBuilderManager;


/**
 * @author kkloor
 *
 */
public class CoffeeBuilderManagerTest {
	/** The test manager. */
	private static CoffeeBuilderManager testManager;
	
	/** The coffee. */
	private Coffee coffee;
	
	/**
	 * Sets the up before class.
	 */
	@BeforeAll
	static void setUpBeforeClass(){
		CoffeeBuilder testBuilder = new CoffeeBuilderImplementation();
        testManager = new CoffeeBuilderManager(testBuilder);
        System.out.println("Set up complete.");
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@AfterEach
	void tearDown() throws Exception{
		coffee = null;
	}

	/**
	 * Test empty order.
	 */
	@Test
	void testEmptyOrder() {
		coffee = testManager.construct(0, false, 0, 0, false, "");
		System.out.println(coffee);
		assertEquals( 100, coffee.getEspresso(),"Only Espresso");
		assertEquals( 0, coffee.getMilk(),"No Milk");
		assertFalse(coffee.getCream(),"No Cream");
		assertEquals( 0, coffee.getWater(),"No Water");
		assertEquals( 0, coffee.getFoam(),"No Foam");
		assertFalse(coffee.hasSugar(),"No Sugar");
		assertTrue(coffee.getFlavor().equals(""), "No flavor"); 
		assertTrue(coffee.toString().equals("[100% espresso]"), "Print order");
	}
	
	/**
	 * Test full order.
	 */
	@Test
	void testFullOrder() {
		coffee = testManager.construct(10, true, 10, 10, true, "hazelnut");
		System.out.println(coffee);
		assertEquals( 70, coffee.getEspresso(),"60% Espresso");
		assertEquals( 10, coffee.getMilk(),"10% Milk");
		assertTrue(coffee.getCream(),"Cream");
		assertEquals( 10, coffee.getWater(),"10% Water");
		assertEquals( 10, coffee.getFoam(),"10% Foam");
		assertTrue(coffee.hasSugar(),"Add Sugar");
		assertTrue(coffee.getFlavor().equals("hazelnut"), "Hazelnut flavor"); 
		assertTrue(coffee.toString().equals("[70% espresso\n 10% cream\n 10% water\n 10% foam\n"
				+ " add sugar\n add hazelnut syrup]"), "Print order");
	}
	
	/**
	 * Test no espresso.
	 */
	@Test
	void testNoEspresso() {
		Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			 coffee = testManager.construct(90, true, 10, 0, true, "");
			  });
		 assertEquals("Your drink is 0% espresso. Try again with less milk/cream/water/foam.", exception.getMessage());
	}
	

}
