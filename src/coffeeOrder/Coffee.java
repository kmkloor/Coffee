package coffeeOrder;

/**
 * The Coffee object.
 * @author kkloor
 */
public class Coffee {
	
	/** The milk. */
	private int milk;
	
	/** The cream. */
	private int cream;
	
	/** The water. */
	private int water;
	
	/** The foam. */
	private int foam;
	
	/** The sugar. */
	private boolean sugar;
	
	/** The flavor. */
	private String flavor;

	/**
	 * Instantiates a new coffee.
	 */
	public Coffee() {
		this.milk = 0;
		this.cream = 0;
		this.water = 0;
		this.foam = 0;
		this.sugar = false;
		this.flavor = "";
		
	}
	
	/**
	 * Gets the milk.
	 *
	 * @return the milk
	 */
	public int getMilk() {
		return milk;
	}

	/**
	 * Sets the milk.
	 *
	 * @param milk the new milk
	 */
	public void setMilk(int milk) {
		this.milk = milk;
	}

	/**
	 * Gets the cream.
	 *
	 * @return the cream
	 */
	public int getCream() {
		return cream;
	}

	/**
	 * Sets the cream.
	 *
	 * @param cream the new cream
	 */
	public void setCream(int cream) {
		this.cream = cream;
	}

	/**
	 * Gets the water.
	 *
	 * @return the water
	 */
	public int getWater() {
		return water;
	}

	/**
	 * Sets the water.
	 *
	 * @param water the new water
	 */
	public void setWater(int water) {
		this.water = water;
	}

	/**
	 * Gets the foam.
	 *
	 * @return the foam
	 */
	public int getFoam() {
		return foam;
	}

	/**
	 * Sets the foam.
	 *
	 * @param foam the new foam
	 */
	public void setFoam(int foam) {
		this.foam = foam;
	}

	/**
	 * Checks if is sugar.
	 *
	 * @return true, if is sugar
	 */
	public boolean isSugar() {
		return sugar;
	}

	/**
	 * Sets the sugar.
	 *
	 * @param sugar the new sugar
	 */
	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}

	/**
	 * Gets the flavor.
	 *
	 * @return the flavor
	 */
	public String getFlavor() {
		return flavor;
	}

	/**
	 * Sets the flavor.
	 *
	 * @param flavor the new flavor
	 */
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
    /**
     * Override the .toString method for the coffee object. 
     */
    @Override
    public String toString() {
    	StringBuilder s = new StringBuilder();
    	boolean custom = false;
    	s.append("Coffee Order:\n[");
    	if (milk > 0) {s.append(milk + "% milk\n"); custom = true;};
    	if (cream > 0) {s.append(cream + "% cream\n"); custom = true;};
    	if (water > 0) {s.append(water + "% water\n"); custom = true;};
    	if (foam > 0) {s.append(foam + "% foam\n"); custom = true;};
    	if (sugar) {s.append("add sugar\n"); custom = true;};
    	if (!flavor.isEmpty()) {s.append("add a pump of " + flavor +" syrup\n"); custom = true;};
    	if (custom) {s.setLength(s.length() - 1);};
    	s.append("]");
    	
        return s.toString();
    }

}
