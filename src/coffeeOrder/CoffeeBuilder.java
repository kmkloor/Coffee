package coffeeOrder;
/**
 * Builder interface for the Coffee class.
 * @author kkloor
 */
public interface CoffeeBuilder {
	
	/**
	 * Builds the.
	 *
	 * @return the coffee
	 */
	Coffee build();
	
	/**
	 * Sets the milk.
	 *
	 * @param milk the percentage milk
	 * @return the coffee builder
	 */
	CoffeeBuilder setMilk(int milk); 
	
	/**
	 * Sets the cream.
	 *
	 * @param cream the percentage cream
	 * @return the coffee builder
	 */
	CoffeeBuilder setCream(boolean cream); 
	
	/**
	 * Sets the water.
	 *
	 * @param water the percentage water
	 * @return the coffee builder
	 */
	CoffeeBuilder setWater(int water);
	
	/**
	 * Sets the foam.
	 *
	 * @param foam the percentage foam
	 * @return the coffee builder
	 */
	CoffeeBuilder setFoam(int foam); 
	
	/**
	 * Sets the sugar.
	 *
	 * @param sugar sugar added
	 * @return the coffee builder
	 */
	CoffeeBuilder setSugar(boolean sugar); 
	
	/**
	 * Sets the flavor.
	 *
	 * @param flavor the flavor
	 * @return the coffee builder
	 */
	CoffeeBuilder setFlavor(String flavor); 
}
