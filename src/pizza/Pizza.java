/*
 * Author Name: Ajay Yadav
 * IDE: IntelliJ IDEA Community Edition
 * Date: 27-01-2022
 */

package pizza;

public class Pizza {
    // field, attribute, member variable (Class Members)
    private double priceInRupees;
    public int sizeInInches;
    public String[] ingredients;
    public String name; // lowerCamelCase

    // price of one ingredient, number, with decimal -> ₹10.0
    final double PRICE_OF_ONE_INGREDIENT_IN_RUPEES = 10.0; // SCREAM_CASE (CONSTANTS)

    final double PRICE_FOR_SMALL_PIZZA_IN_RUPEES = 350.0;
    final double PRICE_FOR_MEDIUM_PIZZA_IN_RUPEES = 500.0;
    final double PRICE_FOR_LARGE_PIZZA_IN_RUPEES = 650.0;

    // create a method to
    // calculate the price of a pizza
    // name, parameter list, return type
    public double calculatePrice(String[] ingredients, int sizeInInches) {
        return (ingredients.length * PRICE_OF_ONE_INGREDIENT_IN_RUPEES) + calculatePriceBasedOnSize(sizeInInches);
    }

    // create a method to calculate price according to size
    private double calculatePriceBasedOnSize(int sizeInInches) {
        return switch (sizeInInches) {
            case 10 -> PRICE_FOR_MEDIUM_PIZZA_IN_RUPEES;
            case 12 -> PRICE_FOR_LARGE_PIZZA_IN_RUPEES;
            default -> PRICE_FOR_SMALL_PIZZA_IN_RUPEES;
        };
    }
}
