package coffeeOrder;

/**
 * The Coffee object.
 * 
 * @author kkloor
 */
public class Coffee {

	/** The espresso. */
	private int espresso;

	/** The milk. */
	private int milk;

	/** The cream. */
	private boolean cream;

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
		this.espresso = 100;
		this.milk = 0;
		this.cream = false;
		this.water = 0;
		this.foam = 0;
		this.sugar = false;
		this.flavor = "";
	}

	/**
	 * Gets the espresso.
	 *
	 * @return the espresso percentage
	 */
	public int getEspresso() {
		espresso = 100 - milk - water - foam;
		return espresso;
	}

	/**
	 * Sets the espresso.
	 *
	 * @param espresso the new espresso percentage
	 */
	public void setEspresso(int espresso) {
		this.espresso = espresso;
	}

	/**
	 * Gets the milk.
	 *
	 * @return the milk percentage
	 */
	public int getMilk() {
		return milk;
	}

	/**
	 * Sets the milk.
	 *
	 * @param milk the new milk percentage
	 */
	public void setMilk(int milk) {
		this.milk = milk;
	}

	/**
	 * Gets the cream percentage.
	 *
	 * @return the cream percentage
	 */
	public boolean getCream() {
		return cream;
	}

	/**
	 * Sets the cream percentage.
	 *
	 * @param cream the new cream percentage
	 */
	public void setCream(boolean cream) {
		this.cream = cream;
	}

	/**
	 * Gets the water percentage.
	 *
	 * @return the water percentage
	 */
	public int getWater() {
		return water;
	}

	/**
	 * Sets the water percentage.
	 *
	 * @param water the new water percentage
	 */
	public void setWater(int water) {
		this.water = water;
	}

	/**
	 * Gets the foam percentage.
	 *
	 * @return the foam percentage
	 */
	public int getFoam() {
		return foam;
	}

	/**
	 * Sets the foam percentage.
	 *
	 * @param foam the new foam percentage
	 */
	public void setFoam(int foam) {
		this.foam = foam;
	}

	/**
	 * Checks if has sugar.
	 *
	 * @return true, if has sugar
	 */
	public boolean hasSugar() {
		return sugar;
	}

	/**
	 * Sets the sugar.
	 *
	 * @param sugar true if has sugar, false if no sugar
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
		s.append("[");
		s.append(espresso + "% espresso\n");
		if (cream == false && milk > 0) {
			s.append(" " + milk + "% milk\n");
		}
		;
		if (cream == true && milk > 0) {
			s.append(" " + milk + "% cream\n");
		}
		;
		if (water > 0) {
			s.append(" " + water + "% water\n");
		}
		;
		if (foam > 0) {
			s.append(" " + foam + "% foam\n");
		}
		;
		if (sugar) {
			s.append(" add sugar\n");
		}
		;
		if (!flavor.isEmpty()) {
			s.append(" add " + flavor + " syrup\n");
		}
		;
		s.setLength(s.length() - 1);
		s.append("]");
		return s.toString();
	}

}
