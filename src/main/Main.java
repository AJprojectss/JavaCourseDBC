/*
 * Author Name: Ajay Yadav
 * IDE: IntelliJ IDEA Community Edition
 * Date: 27-01-2022
 */

package main;
import pizza.Pizza;

public class Main {
    public static void main(String[] args){
        Pizza pizza = new Pizza();
        pizza.sizeInInches = 12;
        pizza.ingredients = new String[]{"yes", "blue","ghg"};

        double result =pizza.calculatePrice(pizza.ingredients, pizza.sizeInInches);
        System.out.println(result);
    }
}
