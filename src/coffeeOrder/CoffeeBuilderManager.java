
package coffeeOrder;

import java.util.Scanner;
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
    	 *
    	 * @param milkOrder the milk order
    	 * @param creamOrder the cream order
    	 * @param waterOrder the water order
    	 * @param foamOrder the foam order
    	 * @param sugarOrder the sugar order
    	 * @param flavorOrder the flavor order
    	 * @return the coffee
    	 */
    	public Coffee construct(int milkOrder, int creamOrder, int waterOrder, int foamOrder, boolean sugarOrder, String flavorOrder) {
	        builder.setMilk(milkOrder).setCream(creamOrder).setWater(waterOrder).setFoam(foamOrder).setSugar(sugarOrder).setFlavor(flavorOrder);
	    	return builder.build();
	    }

//	    public static void main(final String[] arguments) {
//	        final CoffeeBuilder builder = new CoffeeBuilderImplementation();
//
//	        final CoffeeBuilderManager coffeeBuilderManager = new CoffeeBuilderManager(builder);

//	        Scanner reader = new Scanner(System.in);  // Reading from System.in
//	        System.out.println("Milk %: ");
//	        int milk = reader.nextInt();
//	        System.out.println("Cream %: ");
//	        int cream = reader.nextInt();
//	        System.out.println("Water %: ");
//	        int water = reader.nextInt();
//	        System.out.println("Foam %: ");
//	        int foam = reader.nextInt();
//	        System.out.println("Sugar: ");
//	        boolean sugar = reader.nextBoolean();
//	        System.out.println("Flavor: ");
//	        String flavor = reader.next();
//	        System.out.println("Order Received! ");
//	        reader.close();
//	        
//	        System.out.println(coffeeBuilderManager.construct(milk, cream, water, foam, sugar, flavor));
	//    }
}
