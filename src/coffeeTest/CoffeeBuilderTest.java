/**
 * 
 */
package coffeeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coffeeOrder.Coffee;
import coffeeOrder.CoffeeBuilder;
import coffeeOrder.CoffeeBuilderImplementation;
import coffeeOrder.CoffeeBuilderManager;
import org.junit.jupiter.api.Disabled;

/**
 * @author kkloor
 *
 */
public class CoffeeBuilderTest {
	private static CoffeeBuilderManager testManager;
	private Coffee coffee;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass(){
		CoffeeBuilder testBuilder = new CoffeeBuilderImplementation();
        testManager = new CoffeeBuilderManager(testBuilder);
        System.out.println("Set up complete.");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception{
		coffee = null;
	}

	@Test
	void testEmptyOrder() {
		coffee = testManager.construct(0, 0, 0, 0, false, "");
		System.out.println(coffee);
		assertEquals( 0, coffee.getMilk(),"No Milk");
		assertEquals( 0, coffee.getCream(),"No Cream");
		assertEquals( 0, coffee.getWater(),"No Water");
		assertEquals( 0, coffee.getFoam(),"No Foam");
		assertFalse(coffee.isSugar(),"No Sugar");
		assertTrue(coffee.getFlavor().equals(""), "No flavor"); 
		assertTrue(coffee.toString().equals("Coffee Order:\n[]"), "Print order");
	}
	
	@Test
	void testFullOrder() {
		coffee = testManager.construct(10, 10, 10, 10, true, "hazelnut");
		System.out.println(coffee);
		assertEquals( 10, coffee.getMilk(),"10% Milk");
		assertEquals( 10, coffee.getCream(),"10% Cream");
		assertEquals( 10, coffee.getWater(),"10% Water");
		assertEquals( 10, coffee.getFoam(),"10% Foam");
		assertTrue(coffee.isSugar(),"Add Sugar");
		assertTrue(coffee.getFlavor().equals("hazelnut"), "Hazelnut flavor"); 
		assertTrue(coffee.toString().equals("Coffee Order:\n[10% milk\n10% cream\n10% water\n10% foam\n"
				+ "add sugar\nadd a pump of hazelnut syrup]"), "Print order");
	}
	
	

}
