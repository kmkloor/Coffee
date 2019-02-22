
package coffeeOrder;

/**
 * Instantiates a new coffee builder, use the builder to construct coffee objects based on parameters.
 * @author kkloor
 */
public class CoffeeBuilderManager {
		
		/** The builder. */
		private CoffeeBuilder builder;

	    /**
    	 * Instantiates a new coffee builder manager.
    	 *
    	 * @param builder the builder
    	 */
    	public CoffeeBuilderManager(final CoffeeBuilder builder) {
	        this.builder = builder;
	    }
    	
	    /**
    	 * Construct.
    	 * @param milkOrder the milk order
    	 * @param creamOrder the cream order
    	 * @param waterOrder the water order
    	 * @param foamOrder the foam order
    	 * @param sugarOrder the sugar order
    	 * @param flavorOrder the flavor order
    	 * @return the coffee
    	 */
    	public Coffee construct(Integer milkOrder, Boolean creamOrder, Integer waterOrder, Integer foamOrder, Boolean sugarOrder, String flavorOrder) {
    		if (milkOrder != null) {
    		    builder.setMilk(milkOrder);
    		}
    		if (creamOrder != null) {
    		    builder.setCream(creamOrder);
    		}
    		if (waterOrder != null) {
    		    builder.setWater(waterOrder);
    		}
    		if (foamOrder != null) {
    		    builder.setFoam(foamOrder);
    		}
    		if (sugarOrder != null) {
    		    builder.setSugar(sugarOrder);
    		}
    		if (!flavorOrder.isEmpty() && flavorOrder != null) {
    		    builder.setFlavor(flavorOrder);
    		}
	    	return builder.build();
	    }
    	
}
