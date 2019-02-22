package coffeeOrder;

/**
 * Builder implementation for the Coffee class. 
 * @author kkloor
 */
public class CoffeeBuilderImplementation implements CoffeeBuilder {
	
	/** The coffee. */
	private Coffee coffee;

	/**
	 * Instantiates a new coffee builder implementation.
	 */
	public CoffeeBuilderImplementation() {
		coffee = new Coffee();
	}
	
	/* (non-Javadoc)
	 * @see coffeeBuilder.CoffeeBuilder#build()
	 */
	@Override
	public Coffee build() {
		if(coffee.getEspresso() <= 0){
	        throw new IllegalArgumentException("Your drink is 0% espresso. Try again with less milk/cream/water/foam.");    
	    }
		return coffee;
	}


	/* (non-Javadoc)
	 * @see coffeeBuilder.CoffeeBuilder#setMilk(int)
	 */
	@Override
	public CoffeeBuilder setMilk(int milk) {
		coffee.setMilk(milk);
		return this;
	}


	/* (non-Javadoc)
	 * @see coffeeBuilder.CoffeeBuilder#setCream(int)
	 */
	@Override
	public CoffeeBuilder setCream(boolean cream) {
		coffee.setCream(cream);
		return this;
	}


	/* (non-Javadoc)
	 * @see coffeeBuilder.CoffeeBuilder#setWater(int)
	 */
	@Override
	public CoffeeBuilder setWater(int water) {
		coffee.setWater(water);
		return this;
	}


	/* (non-Javadoc)
	 * @see coffeeBuilder.CoffeeBuilder#setFoam(int)
	 */
	@Override
	public CoffeeBuilder setFoam(int foam) {
		coffee.setFoam(foam);
		return this;
	}


	/* (non-Javadoc)
	 * @see coffeeBuilder.CoffeeBuilder#setSugar(boolean)
	 */
	@Override
	public CoffeeBuilder setSugar(boolean sugar) {
		coffee.setSugar(sugar);
		return this;
	}


	/* (non-Javadoc)
	 * @see coffeeBuilder.CoffeeBuilder#setFlavor(java.lang.String)
	 */
	@Override
	public CoffeeBuilder setFlavor(String flavor) {
		coffee.setFlavor(flavor);
		return this;
	}
	

}
