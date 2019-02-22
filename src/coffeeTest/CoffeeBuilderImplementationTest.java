package coffeeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.*;


import coffeeOrder.Coffee;
import coffeeOrder.CoffeeBuilder;
import coffeeOrder.CoffeeBuilderImplementation;
import coffeeOrder.CoffeeBuilderManager;

import org.junit.jupiter.api.Disabled;

/**
 * @author kkloor
 *
 */
public class CoffeeBuilderImplementationTest {
	private CoffeeBuilderImplementation testBuilder;
	private Coffee coffee;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp(){
		this.testBuilder = new CoffeeBuilderImplementation();
		System.out.println("Set up complete.");	
		this.coffee = testBuilder.build();
		System.out.println("Coffee built.");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception{
		coffee = null;
	}
	
	@Test
	void testCoffeeObjectCreation() {		
		assertNotNull(coffee);	
	}
	
	@Test
	void testSetMilk() {
		coffee.setMilk(10);
		assertEquals(10, coffee.getMilk(),"10% Milk");
		assertEquals(90, coffee.getEspresso(),"90% Espresso");
	}
	
	@Test
	void testDefaultNoMilk() {
		assertEquals(0, coffee.getMilk(),"0% Milk");
		assertEquals(100, coffee.getEspresso(),"100% Espresso");
	}
	
	@Test
	void testSetCream() {
		coffee.setCream(true);
		assertTrue(coffee.getCream(),"Has cream");
		assertEquals(100, coffee.getEspresso(),"100% Espresso");
	}
	
	@Test
	void testDefaultNoCream() {
		assertFalse(coffee.getCream(),"No cream");
		assertEquals(100, coffee.getEspresso(),"100% Espresso");
	}
	
	@Test
	void testSetWater() {
		coffee.setWater(50);
		assertEquals(50, coffee.getWater(),"50% Water");
		assertEquals(50, coffee.getEspresso(),"50% Espresso");
	}
	
	@Test
	void testDefaultNoWater() {
		assertEquals(0, coffee.getWater(),"0% Milk");
		assertEquals(100, coffee.getEspresso(),"100% Espresso");
	}
	
	@Test
	void testSetFoam() {
		coffee.setFoam(90);
		assertEquals(90, coffee.getFoam(),"90% Foam");
		assertEquals(10, coffee.getEspresso(),"10% Espresso");
	}
	
	@Test
	void testDefaultNoFoam() {
		assertEquals(0, coffee.getFoam(),"0% Milk");
		assertEquals(100, coffee.getEspresso(),"100% Espresso");
	}
	
	@Test
	void testSetSugar() {
		coffee.setSugar(true);
		assertTrue(coffee.hasSugar(),"Has sugar");
		assertEquals(100, coffee.getEspresso(),"100% Espresso");
	}
	
	@Test
	void testDefaultNoSugar() {
		assertFalse(coffee.hasSugar(),"No sugar");
		assertEquals(100, coffee.getEspresso(),"100% Espresso");
	}
	
	@Test
	void testSetFlavor() {
		coffee.setFlavor("Mocha");
		assertTrue(coffee.getFlavor().equals("Mocha"), "Mocha flavor"); 
		assertEquals(100, coffee.getEspresso(),"100% Espresso");
	}
	
	@Test
	void testDefaultFlavor() {
		assertTrue(coffee.getFlavor().equals(""), "No flavor"); 
		assertEquals(100, coffee.getEspresso(),"100% Espresso");
	}

}
